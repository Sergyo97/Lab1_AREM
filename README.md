# Laboratory 1
This project offers features to calculate mean and standard deviation in a group of numbers.

## Linked List 
These Linked List can store any type of Object and do basic operations like:

 - Add a node in the end
 - Add a node in the beginning
 - Delete a node with it's value![enter image description here](https://www.geeksforgeeks.org/wp-content/uploads/gq/2013/03/Linkedlist.png)Simply design of a Linked List

## Operations
This project can do extra operations also.

 - Mean
In order to obtain the mean of a group of numbers, this formula was implemented.
![enter image description here](https://user-images.githubusercontent.com/13685178/63140069-29e72000-bfa6-11e9-8478-7d15f11e9547.png)
 - Standard deviation
To do the standard deviation follow this formula.
![enter image description here](https://user-images.githubusercontent.com/13685178/63140033-0f14ab80-bfa6-11e9-83cf-7c807f1acb7a.png)

## Running

Compile first time the project after downloaded.

    mvn package
Make unit tests.

    mvn test
To run the whole project.

    mvn exec:java -D "exec.mainClass"="edu.escuelaing.arem.App"
Generate documentation

    mvn javadoc:jar

## Author
Sergio Hernando Ruiz Paez - Escuela Colombiana de Ingeniería Julio Garavito

## License
This project is under GNU General Public License - see [LICENSE](https://github.com/Sergyo97/Lab1_AREM/blob/master/LICENSE) to more info.
