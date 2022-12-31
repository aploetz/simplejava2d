package object;

import javax.imageio.ImageIO;

public class Chest extends SuperObject {

	public Chest() {
		name = "Chest";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
