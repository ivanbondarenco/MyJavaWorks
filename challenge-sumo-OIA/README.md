# sumo-java
Resolucion de ejercicio realizado  en la materia de Programacion con Objetos II. Resuelto con Java

Descripción del problema:
Una academia dedicada a las difíciles artes de
lucha oriental, está organizando un torneo de
luchadores sumo.
A los efectos de conformar la grilla de
combates, es necesario armar parejas de
luchadores que puedan ofrecer un espec
táculo atractivo. Como es sabido que los
cultores de esta disciplina son hombres de
estructura física imponente, los organiza
dores habitualmente arman duplas de
combatientes estableciendo comparaciones
relativas a sus alturas y pesos.
Por experiencia, los organizadores saben que
un combatiente ‘domina’ a otro si lo supera en
ambas medidas, o bien si lo iguala en peso y lo
supera en altura, o viceversa. En cualquier otro
caso, los luchadores no son comparables lo que
hace el resultado imprevisible y por lo tanto más
atractivo para el público.
Sabiendo que no hay luchadores que
coinciden en ambas medidas, los organizadores
quieren saber a cuantos posibles contrincantes
domina cada uno de ellos, y por esta razón se te
pide que escribas un programa que efectúe este recuento

Datos de entrada
Se recibe un archivo sumo.in con el
siguiente formato:
• Una línea que indica la cantidad L (1 ≤
L ≤ 100.000) de luchadores.
• L líneas con 2 números P y H (0 ≤ P,H
≤ 1.000.000) que indican el peso y la altura
de cada participante, separados por
blancos.
Datos de salida
Se debe generar un archivo sumo.out
conteniendo
• L líneas con la cantidad de luchadores a
quienes domina cada participante, en el
mismo orden en el que los participantes
entraron

Si la entrada sumo.in fuera:
10
300 1500
320 1500
299 1580
330 1690
330 1540
339 1500
298 1700
344 1570
276 1678
289 1499
La salida sumo.out debería ser:
1
2
1
6
3
3
2
5
0
0
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------xercise Resolution from the Object-Oriented Programming II Course. Solved with Java
Problem Description:
A martial arts academy specializing in the difficult arts of oriental combat is organizing a sumo wrestling tournament. To create the fight schedule, it's necessary to pair up wrestlers to offer an attractive show. The organizers, knowing that participants in this discipline typically have an imposing physical stature, usually pair fighters by comparing their heights and weights.

A combatant "dominates" another if they exceed the other in both measures, or if they are equal in weight and superior in height, or vice versa. In any other case, the wrestlers are not comparable, making the outcome unpredictable and thus more attractive to the audience. The organizers want to know how many possible opponents each wrestler dominates. Therefore, you're asked to write a program that counts this.

Input Data
The input file sumo.in contains:

One line indicating the number of wrestlers 
 L (1 ≤ 𝐿 L ≤ 100,000).L 
𝐿
L lines with 2 numbers 
𝑃 P and 
𝐻 H (0 ≤ 𝑃,𝐻)
(P,H ≤ 1,000,000) representing the weight and height of each participant, separated by spaces.
Output Data
The output file sumo.out should contain:

𝐿
L lines with the number of wrestlers each participant dominates, in the same order as the participants entered.
If the input sumo.in were:
10
300 1500
320 1500
299 1580
330 1690
330 1540
339 1500
298 1700
344 1570
276 1678
289 1499
The output sumo.out would be:
1
2
1
6
3
3
2
5
0
0
