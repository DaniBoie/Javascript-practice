package labs.lab3;

/**
 * Represents the height of a terrain at different points in a square
 */
public class Terrain {
	
	// ADD YOUR INSTANCE VARIABLES HERE
	double[][] map;
	
	/**
	 * Constructor
	 * 
	 * @param heights	heights of the terrain at different points in a square
	 */
	public Terrain(double[][] heights) {
		map = heights.clone();
		
	}

	
	/**
	 * Returns a flood map, showing which of the points in the terrain would be flooded
	 * if the water level was the given value. A point is flooded if the water level
	 * is > the height of the terrain.
	 * 
	 * In the flood map, each flooded point is represented by a * and each non-flooded
	 * point is represented by a -.
	 * 
	 * @param waterLevel	the water level
	 * 
	 * @return	the flood map
	 */
	public char[][] getFloodMap(double waterLevel) {

		char[][] floodMap = new char[map.length][map.length];

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (waterLevel > map[i][j]) {
					floodMap[i][j] = '*';
				} else {
					floodMap[i][j] = '-';
				}
			}
		}

		return floodMap; // FIX ME
	}
}
