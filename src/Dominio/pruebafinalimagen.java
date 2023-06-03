/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dominio;

import javax.swing.*;
import java.awt.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class pruebafinalimagen extends JFrame {
    private JList<BufferedImage> imageList;
    private DefaultListModel<BufferedImage> listModel;

    public pruebafinalimagen() {
        setTitle("Image List Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        imageList = new JList<>(listModel);
        imageList.setCellRenderer(new ImageListCellRenderer());

        loadImagesFromDirectory();

        JScrollPane scrollPane = new JScrollPane(imageList);
        getContentPane().add(scrollPane);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadImagesFromDirectory() {
        File currentDir = new File(System.getProperty("user.dir"));
        File[] files = currentDir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && isImageFile(file)) {
                    try {
                        BufferedImage image = ImageIO.read(file);
                        if (image != null) {
                            listModel.addElement(image);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private boolean isImageFile(File file) {
        String name = file.getName().toLowerCase();
        return name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".gif");
    }

    private static class ImageListCellRenderer extends JLabel implements ListCellRenderer<BufferedImage> {
        private ImageListCellRenderer() {
            setOpaque(true);
            setHorizontalAlignment(CENTER);
            setVerticalAlignment(CENTER);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends BufferedImage> list, BufferedImage value, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            setIcon(new ImageIcon(value));

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            return this;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(pruebafinalimagen::new);
    }
}
