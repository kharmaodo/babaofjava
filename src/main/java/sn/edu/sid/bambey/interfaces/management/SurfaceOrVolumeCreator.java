package sn.edu.sid.bambey.interfaces.management;

/**
 * Creator of surface or volumes
 */
public class SurfaceOrVolumeCreator {
	public static void main(String[] args) {
		SurfacesOrVolumes rectangle = new Rectangle();
		Integer area = rectangle.area(4, 5);
		Integer volume = rectangle.volume(4, 5, 6);
		displayInformation(area, volume, "Rectangle");
		
		SurfacesOrVolumes triangle = new Triangle();
		area=triangle.area(4, 5);
		volume=triangle.volume(4, 5, 6);
		displayInformation(area, volume, "Triangle");

	}

	/**
	 * Displayer of informations about area and volume
	 * @param area current area
	 * @param volume current volume
	 * @param type TODO
	 */
	private static void displayInformation(Integer area, Integer volume, String type) {
		System.out.println("Surface: of "+type+" [ "+area+" ]  Volume: [ "+volume+" ]");
	}

}
