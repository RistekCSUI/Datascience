package Datascience;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.impl.DenseDoubleMatrix1D;
import cern.colt.matrix.impl.DenseDoubleMatrix2D;
import cern.colt.matrix.linalg.Algebra;
public class LogisticRegression {
	public DoubleMatrix2D X;
	public DoubleMatrix1D y;
	public DoubleMatrix1D theta;
	
	public LogisticRegression(DoubleMatrix2D x, DoubleMatrix1D y, DoubleMatrix1D theta) {
		super();
		X = x;
		this.y = y;
		this.theta = theta;
	}

	public void train(int epoch, double learningRate){
		Algebra a = new Algebra();
		
	}
	
	
	
	public double sigmoid(double z){
		return 1./(1. + Math.exp(-z));
	}
	
	public static void main(String[] args) {
		double x [][] = {{1,2,3},{1,2,3},{1,2,3}};
		double y [] = {1,2,3};
		double theta [] = {1,1,1};
		DoubleMatrix2D m = new DenseDoubleMatrix2D(x);
		LogisticRegression lg = new LogisticRegression(new DenseDoubleMatrix2D(x), new DenseDoubleMatrix1D(y), new DenseDoubleMatrix1D(theta));
		System.out.println(m.cardinality());
	}
}
	
