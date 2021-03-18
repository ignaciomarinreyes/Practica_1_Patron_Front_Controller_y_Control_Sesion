
import business.Degree;
import data.Data;
import java.io.PrintWriter;
import java.util.List;
import util.XsltProcessor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ignacio
 */
public class Main {
    public static void main(String args[]) {
        XsltProcessor s = new XsltProcessor("", "");
        System.out.println(s.readFile());
    }
}
