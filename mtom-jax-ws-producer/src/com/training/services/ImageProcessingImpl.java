package com.training.services;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;

import com.training.ifaces.ImageProcessing;

@WebService(endpointInterface="com.training.ifaces.ImageProcessing")
public class ImageProcessingImpl implements ImageProcessing {

	//to get image in consumer side
	@Override
	public Image getImage(String imageName) {
		// TODO Auto-generated method stub
		
		try {
			return ImageIO.read(new File(imageName));
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	//to send image from consumer to producer
	@Override
	public String sendImage(Image image) {
		
		BufferedImage buffImage=(BufferedImage)image;
		try {
		ImageIO.write(buffImage, "png", new File("download.png"));
		return "Image Upload Success";
	}catch(IOException e) {
		e.printStackTrace();
		return "Image Upload Failed";
	}
	}

}
