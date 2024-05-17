Project Summary: Exiled Knight Game using JavaFX

Objective
The objective of this project is to create an interactive text-based adventure game called "Exiled Knight" using JavaFX for the graphical user interface (GUI) and leveraging tree and linked list data structures for managing the game's scenes and inventory.

Key Components
Tree Data Structure:
tree.java and treeNode.java: These files are responsible for defining the tree data structure used to manage the game scenes. 
Each node in the tree represents a scene in the adventure game, and the tree structure allows for branching storylines based on player choices.

Tree Class:

Manages the root node of the tree.
Provides methods to get and set the root node.
Allows adding child nodes to the parent nodes, facilitating the branching nature of the game storyline.

Linked List Data Structure:
components.java: This interface includes a LinkedList to manage the inventory of the player. The inventory contains Button elements, representing items that can be used or interacted with during the game.

JavaFX GUI Components:
App.java: The main application class that extends Application and implements components. This class is responsible for initializing the primary stage and various secondary stages (e.g., inventory, stats) and setting their properties such as title and position.

Scene Management:
Uses the stageTreeController class to create scenes with one, two, or three buttons, representing different choices available to the player.
Scenes are created using methods like sceneCreator1Button, sceneCreator2Button, and sceneCreator3Button, which help in setting up the text and buttons for each scene.

Alert Settings:
Configures alert dialogs to provide information to the player during the game.

Controller Class:
stageTreeController.java: This class contains methods for creating scenes with different configurations of buttons and layouts. 
It handles the GUI elements and ensures that each scene is properly displayed based on the player's choices.

Launcher Class:
launch.java: The entry point of the application. It invokes the main method of the App class to start the JavaFX application.

Game Flow

Initialization:
The App class initializes the main stage and various secondary stages (inventory, stats).
The primary stage's title is set to "Exiled Knight," and it is positioned on the screen alongside the inventory and stats stages.

Scene Creation:
The game starts with a welcome scene created using sceneCreator1Button.
As the player makes choices, different scenes are loaded based on the structure of the tree data structure. Each choice made by the player corresponds to traversing a node in the tree.

Player Interaction:
The player interacts with the game through buttons representing different choices.
Each button click triggers a transition to a new scene, reflecting the branching storylines.

Inventory Management:
The player's inventory is managed using a linked list of Button elements. Items can be added to the inventory as the player progresses through the game.

Game Alerts:
Information alerts are used to provide feedback or important information to the player at various points during the game.

Conclusion
This project combines JavaFX with tree and linked list data structures to create an engaging text-based adventure game. 
The tree structure allows for dynamic branching storylines based on player choices, while the linked list manages the player's inventory.
JavaFX is utilized to create an intuitive and interactive GUI, enhancing the overall gaming experience...
