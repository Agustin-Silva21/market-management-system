// Gabriel Machado 318697, Agustin Silva 310087

package Dominio;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ArchivoLectura {
    private Scanner in;
    private String linea;
    private BufferedReader reader;
    
    
    public ArchivoLectura(String unNombre, boolean desdeIDE) {
        try {
            in = new Scanner(Paths.get(unNombre));
        } catch (IOException e) {
            System.err.println("Error ");
            System.exit(1);
        }
    }
    
        public ArchivoLectura(String unNombre) {
        try {
            InputStream inputStream = getClass().getProtectionDomain().getCodeSource().getLocation().openStream();
            ZipInputStream zipInputStream = new ZipInputStream(inputStream);

            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                System.out.println(entry.getName());
                if (entry.getName().equals(unNombre)) {
                    InputStreamReader inputStreamReader = new InputStreamReader(zipInputStream, StandardCharsets.UTF_8);
                    reader = new BufferedReader(inputStreamReader);
                    break;
                }
            }
            if (reader == null) {
                throw new FileNotFoundException("No se encontró el archivo: " + unNombre);
            }
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo: " + unNombre);
            System.exit(1);
        }
    }

    public boolean hayMasLineasDesdeIDE() {
        boolean hay = false;
        linea = null;
        if (in.hasNext()){
            linea = in.nextLine();
            hay = true;
        }
        return hay;
    }
    
    public boolean hayMasLineas() {
        try {
            linea = reader.readLine();
            return (linea != null);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String linea() {
        // devuelve la última linea leida
        return linea;
    }

    public void cerrarDesdeIDE() {
        in.close();
    }
    
    public void cerrar() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

