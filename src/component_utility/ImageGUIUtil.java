
package component_utility;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageGUIUtil {
    
    public ImageIcon ResizeImage(String ImagePath, JLabel label){
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public ImageIcon getResourceAsImageIcon(String filepath){
        Image image = new ImageIcon(getClass().getResource(filepath)).getImage();
        ImageIcon imageIcon = new ImageIcon(image);
        return imageIcon;
        /* Example usage: 
            Image loginBg = new ImageGUIUtil().getAssetImage("foldername/filename.extension");
        */
    }
    
    public ImageIcon getResourceAsImageIcon(String filepath, int targetWidth, int targetHeight){
        Image imageResource = new ImageIcon(getClass().getResource(filepath)).getImage();
        Image renderedImage = imageResource.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(renderedImage);
        return imageIcon;
        /* Example usage: 
            Image loginBg = new ImageGUIUtil().getAssetImage("foldername/filename.extension");
        */
    }
    
    public Image getResourceAsImage(String filepath, int targetWidth, int targetHeight){
        Image imageResource = new ImageIcon(getClass().getClassLoader().getResource(filepath)).getImage();
        Image renderedImage = imageResource.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        return renderedImage;
        /* Example usage: 
            Image loginBg = new ImageGUIUtil().getAssetImage("foldername/filename.extension");
        */
    }
    
    public Image getResourceAsImage(String filepath){
        Image img = new ImageIcon(getClass().getClassLoader().getResource(filepath)).getImage();
        return img;
        /* Example usage: 
            Image loginBg = new ImageGUIUtil().getAssetImage("foldername/filename.extension");
        */
    }
    
    public ImageIcon getResourceImage(String filepath, JLabel label){
        Image rawImage = new ImageIcon(getClass().getClassLoader().getResource(filepath)).getImage();
        Image renderedImage = rawImage.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(renderedImage);
        return image;
    }
    
    public Image getRenderedImageForJPanel(String aImageFilePath, JPanel aJpanel){
        Image rawImage = new ImageIcon(getClass().getClassLoader().getResource(aImageFilePath)).getImage();
        Image renderedImage = rawImage.getScaledInstance(aJpanel.getWidth(), aJpanel.getHeight(), Image.SCALE_SMOOTH);
        return renderedImage;
    }
    
    public ImageIcon getResourceImage(String filepath, JButton button){
        Image rawImage = new ImageIcon(getClass().getClassLoader().getResource(filepath)).getImage();
        Image renderedImage = rawImage.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(renderedImage);
        return image;
    }
    
    public Image getResourceImage(String filepath, JPanel panel){
        Image rawImage = new ImageIcon(getClass().getClassLoader().getResource(filepath)).getImage();
        Image renderedImage = rawImage.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
        return renderedImage;
    }
    
}
