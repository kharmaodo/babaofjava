package sn.edu.sid.bambey.interfaces.management;
/**
 * How to proceed for compute surfaces & volumes
 * 
 */
public interface SurfacesOrVolumes {
	/**
	 * Compute for an  area
	 * 
	 * @param a first element
	 * @param b second element
	 * @return the final result
	 */
	public Integer area(Integer a, Integer b);
	
	/**
	 * Compute for a volume 
	 * 
	 * @param a first element
	 * @param b second element
	 * @param c third element
	 * @return the final result
	 */
	public Integer volume(Integer a, Integer b, Integer c);
}
