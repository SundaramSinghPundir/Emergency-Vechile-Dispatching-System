package DAA;
import DAA.Vehicle;
import DAA.Vertex;
import DAA.Distance;
import DAA.Dijkstra;
import DAA.Edge;
import DAA.mainy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;


public class Main extends Dijkstra {
    public static Vertex zip = null;
    public Main(Vertex argTarget, double argWeight) {

            super(argTarget, argWeight);

        }
        public static void main(String[] args) throws IOException{

        new Vehicle();
        new Distance();

        String zipcode = JOptionPane.showInputDialog("Enter the zipcode");
        System.out.print("Given zipcode is :"+zipcode+"\n");

        Vertex Zip = new Vertex(zipcode);
        System.out.println("\n"+"Using Dijstra's Algorithm"+"\n"+"shortest paths from given zipcode to other zipcodes are displayed below");
        Zip.vertexrun(Zip);

    }
}
