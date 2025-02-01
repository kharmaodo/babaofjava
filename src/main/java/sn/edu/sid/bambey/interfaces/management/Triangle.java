package sn.edu.sid.bambey.interfaces.management;

public class Triangle implements SurfacesOrVolumes {

	@Override
	public Integer area(Integer a, Integer b) {
		return (a*b)/2;
	}

	@Override
	public Integer volume(Integer a, Integer b, Integer c) {
		return a*b*c;
	}

}
