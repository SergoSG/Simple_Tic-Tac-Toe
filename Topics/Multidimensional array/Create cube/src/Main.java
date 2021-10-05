
class ArrayOperations {
    public static int[][][] createCube() {
        final int dimension = 3;
        int[][][] cube = new int[dimension][dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                for (int k = 0; k < dimension; k++) {
                    cube[i][j][k] = j * dimension + k;
                }
            }
        }
        return cube;
    }
}