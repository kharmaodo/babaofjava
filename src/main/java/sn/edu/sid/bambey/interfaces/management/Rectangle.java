/**
 * 
 */
package sn.edu.sid.bambey.interfaces.management;

/**
 * 
 */
public class Rectangle implements SurfacesOrVolumes {

	@Override
	public Integer area(Integer a, Integer b) {
		return a*b;
	}

	@Override
	public Integer volume(Integer a, Integer b, Integer c) {
		return 0;
	}

}
