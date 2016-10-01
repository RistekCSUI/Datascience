
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.impl.DenseDoubleMatrix2D;
import cern.colt.matrix.linalg.Algebra;
import java.lang.Math;
public class LogisticRegression {
	public DoubleMatrix2D X;
	public DoubleMatrix1D y;
	
	
	public double sigmoid(double z){
		return 1./(1. + Math.exp(-z));
	}
	
	public static void main(String[] args) {
		double[][] m = {{1,2,3},{5,6,7},{8,9,10}};
		double[][] j = {{1,2,3},{1,1,1},{0,0,1}};
		Algebra a = new Algebra();
		DoubleMatrix2D matrix1 = new DenseDoubleMatrix2D(m);
		DoubleMatrix2D matrix2 = new DenseDoubleMatrix2D(j);
		System.out.println(a.mult(matrix1, matrix2));
	}
}
	
