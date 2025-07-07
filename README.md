
---

```markdown
# 📘 Informe de desarrollo - Árboles Binarios en Java

Este proyecto incluye la resolución de cuatro ejercicios prácticos relacionados con árboles binarios, enfocados en la implementación de estructuras básicas, recorridos, operaciones y manipulación de nodos en Java. A lo largo del desarrollo se usaron buenas prácticas de organización por paquetes y reutilización de clases.

---

## 🔧 Estructura del proyecto

```

main/
├── App.java
├── Ejercicio\_01\_insert/
│   └── InsertBST.java
├── Ejercicio\_02\_invert/
│   └── InvertBinaryTree.java
├── Ejercicio\_03\_listLeves/
│   └── ListLevels.java
├── Ejercicio\_04\_depth/
│   └── Depth.java
├── Materia/
│   └── Models/
│       └── Node.java
utils/
└── StudentValidator.java
test/
└── Ejercicio\_XX/ (Tests provistos por el docente)

````

---

## 👨‍🎓 Validación de estudiante

Antes de iniciar con los ejercicios, se ejecuta el método:

```java
StudentValidator.validarDatos();
````

Este devuelve un objeto `Estudiante` con el nombre y correo del alumno. Se muestra al principio de la salida por consola como parte del formato de entrega.

---

## 🌳 Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

**Clase:** `InsertBST`
**Paquete:** `main.Ejercicio_01_insert`
**Método clave:** `public Node insert(Node root, int value)`

### 🔍 ¿Qué se hizo?

Se implementó un algoritmo recursivo para insertar elementos en un BST. Cada valor es comparado con el nodo actual: si es menor, se intenta insertar en el subárbol izquierdo; si es mayor, en el derecho. Si el nodo es `null`, se crea uno nuevo.

### ✅ Resultado

Con la inserción de valores como `4, 2, 7, 1, 3, 6, 9`, el árbol queda construido correctamente para usar en los siguientes ejercicios.

---

## 🔁 Ejercicio 02: Invertir un Árbol Binario

**Clase:** `InvertBinaryTree`
**Paquete:** `main.Ejercicio_02_invert`
**Método clave:** `public Node invertTree(Node root)`

### 🔍 ¿Qué se hizo?

A través de recursión, se recorren todos los nodos del árbol y se intercambian sus hijos izquierdo y derecho. El proceso se repite para cada subárbol.

### ✅ Resultado

El árbol queda reflejado horizontalmente. Por ejemplo, si antes el nodo `2` estaba a la izquierda de `4`, luego del intercambio estará a la derecha.

---

## 📊 Ejercicio 03: Listar Niveles en Listas Enlazadas

**Clase:** `ListLevels`
**Paquete:** `main.Ejercicio_03_listLeves`
**Método clave:** `public List<List<Node>> listLevels(Node root)`

### 🔍 ¿Qué se hizo?

Se usó un recorrido **por niveles (BFS)** con una cola (`Queue`). En cada iteración se obtiene la cantidad de nodos por nivel y se almacenan temporalmente en una lista, que luego se agrega al resultado.

### ✅ Resultado

Se obtiene una lista de listas, donde cada sublista contiene los nodos de un mismo nivel. Esto ayuda a visualizar la estructura jerárquica del árbol.

---

## 🌲 Ejercicio 04: Calcular la Profundidad Máxima

**Clase:** `Depth`
**Paquete:** `main.Ejercicio_04_depth`
**Método clave:** `public int maxDepth(Node root)`

### 🔍 ¿Qué se hizo?

Se implementó una función recursiva que calcula la altura máxima del árbol. En cada paso, se evalúa la profundidad del subárbol izquierdo y derecho, y se retorna el mayor entre ambos más uno (por el nodo actual).

### ✅ Resultado

Con el árbol invertido usado en este ejercicio, se calculó correctamente la profundidad total como `3`.

---

## 🧪 Pruebas

Se proporcionaron tests automáticos con JUnit para validar cada ejercicio individualmente. Las clases fueron diseñadas y organizadas para cumplir con las condiciones requeridas por estos tests, incluyendo el uso de getters y setters en la clase `Node`.

---

## 📝 Clase App.java

En el archivo `App.java` se integran los 4 ejercicios en una ejecución secuencial. Se realiza lo siguiente:

1. Se valida al estudiante.
2. Se inserta el árbol.
3. Se invierte.
4. Se listan los niveles.
5. Se muestra la profundidad.

### 🖨️ Ejemplo de salida:

```
👤 Estudiante: AXEL BANEGAS
✉️  Correo: abanegasl@est.ups.edu.ec
📊 Niveles del árbol invertido:
Nivel 0: 4
Nivel 1: 7 2
Nivel 2: 9 6 3 1
🌲 Profundidad máxima del árbol invertido: 3
```

---

## 🔚 Conclusión

Este proyecto permitió aplicar múltiples conceptos clave de estructuras de datos en Java, en particular sobre árboles binarios. Se trabajó con clases organizadas por paquetes, encapsulamiento mediante getters/setters, y algoritmos recursivos y por niveles, todos integrados con pruebas automatizadas para validar el correcto funcionamiento de cada componente.

```

---


```

