package main;

import utils.StudentValidator;
import main.Materia.Models.Node;
import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        // Ejercicio 01: Insertar en BST
        InsertBST bst = new InsertBST();
        Node root = null;
        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        for (int v : valores) {
            root = bst.insert(root, v);
        }

        // Ejercicio 02: Invertir árbol
        InvertBinaryTree inversor = new InvertBinaryTree();
        Node arbolInvertido = inversor.invertTree(root);

        // Ejercicio 03: Listar niveles
        ListLevels listador = new ListLevels();
        List<List<Node>> niveles = listador.listLevels(arbolInvertido);
        System.out.println("📊 Niveles del árbol invertido:");
        for (int i = 0; i < niveles.size(); i++) {
            System.out.print("Nivel " + i + ": ");
            for (Node nodo : niveles.get(i)) {
                System.out.print(nodo.getValue() + " ");
            }
            System.out.println();
        }

        // Ejercicio 04: Profundidad máxima
        Depth profundidad = new Depth();
        int maxDepth = profundidad.maxDepth(arbolInvertido);
        System.out.println("🌲 Profundidad máxima del árbol invertido: " + maxDepth);
    }
}
