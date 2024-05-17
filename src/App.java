import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class App extends Application implements components {
        /*            Variables             */
        Integer slashDamage = 0, pierceDamage = 0, HP = 10;
		int randNumber = rand.nextInt(3);


		/*            Alert Settings              */
	    Alert informationAlert = new Alert(AlertType.INFORMATION);


	    public void start(Stage mainStage) {
			
		
		/*--------------- Stage Settings ---------------*/
		Stage inventoryStage = new Stage();
		Stage statStage = new Stage();
		mainStage.setTitle("Exiled Knight");
		inventoryStage.setTitle("Inventory");
		statStage.setTitle("Stats");
		mainStage.setX(600);
		mainStage.setY(200);
		inventoryStage.setX(1005);
		inventoryStage.setY(200);
		statStage.setX(370);
		statStage.setY(200);
		
        /*--------------- Scenes Creating Process ---------------*/
		Scene mainScene = stageTreeController.sceneCreator1Button(welcomeText, startPlayingButton, mainLayout, 115, 165, 100, 60, 400, 350, 250);
        Scene scene1Prologue =  stageTreeController.sceneCreator1Button(storyText1, scene1ProloguechoiceA, scene1PrologueLayout, 40, 315, 50, 25, 400, 350, 250);
        Scene scene2Prologue2 = stageTreeController.sceneCreator1Button(storyText2, scene2Prologue2choiceA, scene2Prologue2Layout, 40, 315, 50, 25, 400, 350, 250);
        Scene scene3JustEnteredKingdom = stageTreeController.sceneCreator2Button(storyText3, scene3JustEnteredKingdomchoiceA, scene3JustEnteredKingdomchoiceB, scene3JustEnteredKingdomLayout, 10, 315, 10, 275, 50, 25, 400, 350, 250);
		Scene scene4OnTheRoad =  stageTreeController.sceneCreator1Button(storyText4, scene4OnTheRoadchoiceA, scene4OnTheRoadLayout, 40, 315, 50, 25, 400, 350, 250);
        Scene scene5AtTheInn = stageTreeController.sceneCreator1Button(storyText5, scene5AtTheInnchoiceA, scene5AtTheInnLayout, 40, 315, 50, 25, 400, 350, 250);
        Scene scene5aTheSpear = stageTreeController.sceneCreator2Button(storyText5a, scene5aTheSpearchoiceA, scene5aTheSpearchoiceB, scene5aTheSpearLayout, 10, 315, 10, 275, 50, 25, 400, 350, 250);
		Scene scene5bBoarKilledYou = stageTreeController.sceneCreator1Button(storyTextBoarKilledYou, gameOver,  scene5BoarKilledYouLayout, 40, 315, 50, 25, 400, 350, 250);
        Scene scene5cSwordAttack = stageTreeController.sceneCreator1Button(storyTextYouSword, scene5caStrikeTheBeastAgain, scene5cSwordAttackLayout, 40, 315, 50, 25, 400, 350, 250);
        Scene scene5YouKilledBoar = stageTreeController.sceneCreator2Button(storyTextYouKilledBoar, scene5baButton, scene5bbButton, scene5bbKilledBoarLayout, 10, 315, 10, 275, 50, 25, 400, 350, 250);
        Scene scene5dInsideTheInn = stageTreeController.sceneCreator1Button(storyText5dText, scene5dButton, scene5dInsideTheInnLayout, 40, 315, 50, 25, 400, 350, 250);
        Scene scene5eNothingMoreInTheInn = stageTreeController.sceneCreator1Button(storyText5eText, scene5eButton, scene5eNothingMoreInTheInnLayout, 40, 315, 50, 25, 400, 350, 250);
        Scene scene6WhoGoesThere = stageTreeController.sceneCreator3Button(storyText6Text, scene61Button, scene62Button, scene63Button, scene6WhoGoesThereLayout, 10, 315, 10, 245, 10, 195, 50 , 25, 400, 350, 250);
		Scene scene6bFoundSomeAllies = stageTreeController.sceneCreator1Button(storyText6b, scene6bchoiceA, scene6bFoundSomeAlliesLayout, 40, 250, 40, 25, 400, 350, 250);
        Scene scene6cShouldveToldThem = stageTreeController.sceneCreator2Button(storyText6c, scene6cChoiceA, scene6cChoiceB, scene6cShouldveToldThemLayout,  10, 315, 10, 275, 50, 25, 400, 350, 250);
        Scene scene6dOldTimesSake = stageTreeController.sceneCreator1Button(storyText6d, scene6dchoiceA, scene6dOldTimesSakeLayout,  40, 315, 50, 25, 400, 350, 250);
		Scene scene6eBadNews = stageTreeController.sceneCreator1Button(storyText6e, scene6eChoiceA, scene6eBadNewsLayout,  40, 270, 50, 25, 400, 350, 250);
		Scene scene6fGlimpseOfHope = stageTreeController.sceneCreator1Button(storyText6f, scene6fChoiceA, scene6fGlimpseOfHopeLayout, 40, 270, 50, 25, 400, 350, 250);
		Scene scene6gEndOfLongTalks = stageTreeController.sceneCreator2Button(storyText6g, scene6gChoiceA, scene6gChoiceB, scene6gEndOfLongTalksLayout, 10, 180, 10, 260, 50, 25, 400, 350, 250);
		Scene scene8BeginningOfaMission = stageTreeController.sceneCreator1Button(storyText8, scene8ChoiceA, scene8BeginningOfMissionLayout, 10, 270, 20, 25, 400, 350, 275);
		Scene scene99RidingWithGallant = stageTreeController.sceneCreator1Button(storyText99, scene99ChoiceA, scene99RidingWithGallantLayout, 10, 270, 20, 25, 400, 350, 275);
		Scene scene99aLastBattle = stageTreeController.sceneCreator2Button(storyText99A, scene99AChoiceA, scene99AChoiceB, scene99aLastBattleLayout, 10, 270, 10, 295, 20, 25, 400, 350, 250);
		Scene scene99bEpicDeath = stageTreeController.sceneCreator1Button(storyText99B, gameOver1, scene99bEpicDeathLayout, 10, 270, 20, 25, 400, 350, 250);
		Scene scene99cCowardDeath = stageTreeController.sceneCreator1Button(storyText99C, gameOver2, scene99cCowardDeathLayout, 10, 270, 20, 25, 400, 350, 250);
		Scene scene100DumbDeath = stageTreeController.sceneCreator1Button(storyText100, gameOver3, scene100dumbDeathLayout, 10, 270, 20, 25, 400, 350, 250);
		Scene scene9PushingHisLuck = stageTreeController.sceneCreator1Button(storyText9, scene9ChoiceA, scene9PushingHisLuckLayout, 10, 270, 20, 25, 400, 350, 250);
		Scene scene9aCaptiveAgain = stageTreeController.sceneCreator1Button(storyText9a, scene9aChoiceA, scene9aCaptiveAgainLayout, 10, 270, 20, 25, 400, 350, 250);
		Scene scene8aWayToHadrianKeep = stageTreeController.sceneCreator1Button(storyText8a, scene8aChoiceA, scene8aWayToHadrianKeepLayout, 10, 270, 20, 25, 400, 350, 250);
		Scene scene8bTheDarkKnight = stageTreeController.sceneCreator2Button(storyText8b, scene8bChoiceA, scene8bChoiceB, scene8bTheDarkKnightLayout, 10, 250, 10, 300, 50, 25, 400, 350, 250);
		Scene scene8cDarkKnightDoesNotFall = stageTreeController.sceneCreator1Button(storyText8c, scene8cChoiceA, scene8cDarkKnightDoesNotFallLayout, 10, 270, 20, 25, 400, 350, 250);
		Scene scene8zDeathInDarkness = stageTreeController.sceneCreator1Button(storyText8z, gameOver4, scene8zDeathInDarknessLayout, 10, 270, 20, 25, 400, 350, 250);
		Scene scene8dDefenciveStance = stageTreeController.sceneCreator2Button(storyText8d, scene8dChoiceA, scene8dChoiceB, scene8dDefenciveStanceLayout, 10, 270, 10, 295, 20, 25, 400, 350, 250);
		Scene scene8eTheEnd = stageTreeController.sceneCreator1Button(storyText8e, scene8eChoiceA, scene8eTheEndLayout, 10, 270, 20, 25, 400, 350, 250);
		Scene sceneCredits = stageTreeController.sceneCreator1Button(storyTextCredits, playAgain, sceneCreditsLayout, 10, 270, 20, 25, 400, 350, 250);
		Scene inventoryScene = new Scene(inventoryLayout, 230, 350);
		Scene statScene = new Scene(statLayout, 225, 150);
		
		

		/*---------------statLayout Settings---------------*/
		Text healthPoints = new Text("HP: " + HP);
		Text slashDamageText = new Text("Slash Damage: " + slashDamage);
		Text pierceDamageText = new Text("Pierce Damage: " + pierceDamage);
		statLayout.getChildren().addAll(healthPoints, slashDamageText, pierceDamageText);
		healthPoints.setLayoutX(35);
		healthPoints.setLayoutY(35);
		slashDamageText.setLayoutX(35);
		slashDamageText.setLayoutY(70);
		pierceDamageText.setLayoutX(35);
		pierceDamageText.setLayoutY(105);
				
		tree myTree = new tree();
		treeNode nodeRoot = new treeNode(mainScene);
        treeNode nodeScene1 = new treeNode(scene1Prologue);
        treeNode nodeScene2 = new treeNode(scene2Prologue2);
        treeNode nodeScene3 = new treeNode(scene3JustEnteredKingdom);
        treeNode nodeScene4 = new treeNode(scene4OnTheRoad);
        treeNode nodeScene5 = new treeNode(scene5AtTheInn);
        treeNode nodeScene5a = new treeNode(scene5aTheSpear);
        treeNode nodeScene5b = new treeNode(scene5bBoarKilledYou);
        treeNode nodeScene5c = new treeNode(scene5cSwordAttack);
        treeNode nodeScene5bb = new treeNode(scene5YouKilledBoar);
        treeNode nodeScene5d = new treeNode(scene5dInsideTheInn);
        treeNode nodeScene5e = new treeNode(scene5eNothingMoreInTheInn);
        treeNode nodeScene6 = new treeNode(scene6WhoGoesThere);
        treeNode nodeScene6b = new treeNode(scene6bFoundSomeAllies);
        treeNode nodeScene6c = new treeNode(scene6cShouldveToldThem);
        treeNode nodeScene6d = new treeNode(scene6dOldTimesSake);
        treeNode nodeScene6e = new treeNode(scene6eBadNews);
        treeNode nodeScene6f = new treeNode(scene6fGlimpseOfHope);
        treeNode nodeScene6g = new treeNode(scene6gEndOfLongTalks);
        treeNode nodeScene8 = new treeNode(scene8BeginningOfaMission);
        treeNode nodeScene99 = new treeNode(scene99RidingWithGallant);
        treeNode nodeScene99a = new treeNode(scene99aLastBattle);
        treeNode nodeScene99b = new treeNode(scene99bEpicDeath);
        treeNode nodeScene99c = new treeNode(scene99cCowardDeath);
        treeNode nodeScene100 = new treeNode(scene100DumbDeath);
        treeNode nodeScene9 = new treeNode(scene9PushingHisLuck);
        treeNode nodeScene9a = new treeNode(scene9aCaptiveAgain);
        treeNode nodeScene8a = new treeNode(scene8aWayToHadrianKeep);
        treeNode nodeScene8b = new treeNode(scene8bTheDarkKnight);
        treeNode nodeScene8c = new treeNode(scene8cDarkKnightDoesNotFall);
        treeNode nodeScene8z = new treeNode(scene8zDeathInDarkness);
        treeNode nodeScene8d = new treeNode(scene8dDefenciveStance);
        treeNode nodeScene8e = new treeNode(scene8eTheEnd);
		treeNode nodeSceneCredits = new treeNode(sceneCredits);
		

			myTree.addChild(null, nodeRoot);  
			myTree.addChild(nodeRoot, nodeScene1);  
			myTree.addChild(nodeScene1, nodeScene2); 
			myTree.addChild(nodeScene2, nodeScene3); 
			myTree.addChild(nodeScene3, nodeScene4);
			myTree.addChild(nodeScene3, nodeScene5);
			myTree.addChild(nodeScene4, nodeScene6);
			myTree.addChild(nodeScene5, nodeScene5a);
			myTree.addChild(nodeScene5a, nodeScene5b);	
			myTree.addChild(nodeScene5a, nodeScene5bb);
			myTree.addChild(nodeScene5a, nodeScene5c);
			myTree.addChild(nodeScene5b, nodeScene5d);
			myTree.addChild(nodeScene5b, nodeScene4);
			myTree.addChild(nodeScene5c, nodeScene5b);
			myTree.addChild(nodeScene5c, nodeScene5bb);
			myTree.addChild(nodeScene5e, nodeScene4);
			myTree.addChild(nodeScene8d, nodeScene8e);
			myTree.addChild(nodeScene4, nodeScene6);
			myTree.addChild(nodeScene5, nodeScene5b);
			myTree.addChild(nodeScene5, nodeScene5d);
			myTree.addChild(nodeScene6, nodeScene6b);
			myTree.addChild(nodeScene6, nodeScene6c);
			myTree.addChild(nodeScene6b, nodeScene6d);
			myTree.addChild(nodeScene6d, nodeScene6e);
			myTree.addChild(nodeScene6e, nodeScene6f);
			myTree.addChild(nodeScene6f, nodeScene6g);
			myTree.addChild(nodeScene6g, nodeScene8);
			myTree.addChild(nodeScene8, nodeScene8a);
			myTree.addChild(nodeScene8a, nodeScene8b);
			myTree.addChild(nodeScene8b, nodeScene8c);
			myTree.addChild(nodeScene8c, nodeScene8d);
			myTree.addChild(nodeScene8c, nodeScene8e);
			myTree.addChild(nodeScene8e, nodeScene9);
			myTree.addChild(nodeScene9, nodeScene9a);
			myTree.addChild(nodeScene9a, nodeScene99);
			myTree.addChild(nodeScene99, nodeScene99a);
			myTree.addChild(nodeScene99a, nodeScene99b);
			myTree.addChild(nodeScene99a, nodeScene99c);
			myTree.addChild(nodeScene99b, nodeScene8z);
			myTree.addChild(nodeScene99c, nodeScene8z);
			myTree.addChild(nodeScene9a, nodeSceneCredits);
			myTree.addChild(nodeScene8e, nodeSceneCredits);
            

            /*---------------Button's Event Handlers ---------------*/

			knightSword.setOnAction(event -> {
					slashDamage = 3;
					pierceDamage = 0;
					
					pierceDamage = pierceDamage+1;
                	slashDamageText.setText("Slash Damage: " + slashDamage);
                	pierceDamageText.setText("Pierce Damage: " + pierceDamage);
					knightSword.setDisable(true);
					infantrySpear.setDisable(false);
					claymore.setDisable(false);
					informationAlert.setTitle("Equipped Item ");
					informationAlert.setContentText("You've equipped the Knight's Sword!");
					informationAlert.setHeaderText("");
					informationAlert.show();	
        		}); 
			infantrySpear.setOnAction(event -> {
					slashDamage = 0;
					pierceDamage = 0;
					slashDamage = slashDamage +1;
					pierceDamage = pierceDamage +3;
					slashDamageText.setText("Slash Damage: " + Integer.toString(slashDamage));
					pierceDamageText.setText("Pierce Damage: " +  Integer.toString(pierceDamage) );
					infantrySpear.setDisable(true);
					knightSword.setDisable(false);
					claymore.setDisable(false);
					informationAlert.setTitle("Equipped Item ");
					informationAlert.setContentText("You've equipped the Infantry Spear!");
					informationAlert.setHeaderText("");
					informationAlert.show();
					});

			healthPotion.setOnAction(event -> {
						HP+=3;
						healthPoints.setText("HP: " + HP);
						inventoryLayout.getChildren().remove(healthPotion);
					});		

			claymore.setOnAction(event -> {										
						slashDamage = 0;
						pierceDamage = 0;
						slashDamage = slashDamage+10;
						pierceDamage = pierceDamage+6;
						slashDamageText.setText("Slash Damage: " + slashDamage);
						pierceDamageText.setText("Pierce Damage: " + pierceDamage);
						claymore.setDisable(true);
						infantrySpear.setDisable(false);
						knightSword.setDisable(false);
						informationAlert.setTitle("Equipped Item ");
						informationAlert.setContentText("You've equipped the Claymore!");
						informationAlert.setHeaderText("");
						informationAlert.show();
			});


			gameOver1.setOnAction(event -> {
            
				mainStage.setScene(mainScene);
				knightSword.setDisable(false);
				infantrySpear.setDisable(false);
				claymore.setDisable(false);
				inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
				Inventory.clear();
				slashDamage = 0;
				pierceDamage = 0;
				slashDamageText.setText("Slash Damage: " + slashDamage);
				pierceDamageText.setText("Pierce Damage: " + pierceDamage);
				HP=10;
				healthPoints.setText("HP: " + HP);
				statStage.setScene(statScene);});

			gameOver2.setOnAction(event -> {
            
				mainStage.setScene(mainScene);
				knightSword.setDisable(false);
				infantrySpear.setDisable(false);
				claymore.setDisable(false);
				inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
				Inventory.clear();
				slashDamage = 0;
				pierceDamage = 0;
				slashDamageText.setText("Slash Damage: " + slashDamage);
				pierceDamageText.setText("Pierce Damage: " + pierceDamage);
				HP=10;
				healthPoints.setText("HP: " + HP);
				statStage.setScene(statScene);});

			gameOver3.setOnAction(event -> {
            
				mainStage.setScene(mainScene);
				knightSword.setDisable(false);
				infantrySpear.setDisable(false);
				claymore.setDisable(false);
				inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
				Inventory.clear();
				slashDamage = 0;
				pierceDamage = 0;
				slashDamageText.setText("Slash Damage: " + slashDamage);
				pierceDamageText.setText("Pierce Damage: " + pierceDamage);
				HP=10;
				healthPoints.setText("HP: " + HP);
				statStage.setScene(statScene);});		
			
			gameOver4.setOnAction(event -> {
            
				mainStage.setScene(mainScene);
				knightSword.setDisable(false);
				infantrySpear.setDisable(false);
				claymore.setDisable(false);
				inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
				Inventory.clear();
				slashDamage = 0;
				pierceDamage = 0;
				slashDamageText.setText("Slash Damage: " + slashDamage);
				pierceDamageText.setText("Pierce Damage: " + pierceDamage);
				HP=10;
				healthPoints.setText("HP: " + HP);
				statStage.setScene(statScene);});

			gameOver.setOnAction(event -> {
            
				mainStage.setScene(mainScene);
				knightSword.setDisable(false);
				infantrySpear.setDisable(false);
				claymore.setDisable(false);
				inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
				Inventory.clear();
				slashDamage = 0;
				pierceDamage = 0;
				slashDamageText.setText("Slash Damage: " + slashDamage);
				pierceDamageText.setText("Pierce Damage: " + pierceDamage);
				HP=10;
				healthPoints.setText("HP: " + HP);
				statStage.setScene(statScene);});	

			playAgain.setOnAction(event -> {
            
				mainStage.setScene(mainScene);
				knightSword.setDisable(false);
				infantrySpear.setDisable(false);
				claymore.setDisable(false);
				inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
				Inventory.clear();
				slashDamage = 0;
				pierceDamage = 0;
				slashDamageText.setText("Slash Damage: " + slashDamage);
				pierceDamageText.setText("Pierce Damage: " + pierceDamage);
				HP=10;
				healthPoints.setText("HP: " + HP);
				statStage.setScene(statScene);});
		
				
			startPlayingButton.setOnAction(event -> {
				mainStage.setScene(nodeScene1.getScene());
				Inventory.add(knightSword);
				inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
    			inventoryLayout.getChildren().addAll(Inventory);
    			knightSword.setLayoutX(10);
    			knightSword.setLayoutY(10);
			});
	
			scene1ProloguechoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene2.getScene());
			});
			
			scene2Prologue2choiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene3.getScene());
			});
			
			scene3JustEnteredKingdomchoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene4.getScene());
			});
			
			scene3JustEnteredKingdomchoiceB.setOnAction(event -> {
				mainStage.setScene(nodeScene5.getScene());
			});
			
			scene4OnTheRoadchoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene6.getScene());
			});
			
			scene5AtTheInnchoiceA.setOnAction(event -> {
				
				Inventory.add(infantrySpear);
				inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
    			inventoryLayout.getChildren().addAll(Inventory);
    			infantrySpear.setLayoutX(10);
    			infantrySpear.setLayoutY(35);
                informationAlert.setTitle("New Weapon ");
				informationAlert.setContentText("Infantry Spear added to inventory ");
				informationAlert.setHeaderText("");
                informationAlert.show();
				mainStage.setScene(nodeScene5a.getScene());

			});
			
			scene5aTheSpearchoiceA.setOnAction(event -> {
				if(pierceDamage > 2){
					HP-=2;
					healthPoints.setText("HP: " + HP);
					mainStage.setScene(nodeScene5bb.getScene());}
				else if(pierceDamage < 2 && pierceDamage != 0){
					HP-=5;
					healthPoints.setText("HP: " + HP);
					mainStage.setScene(nodeScene5c.getScene());
					}
				else{
					HP-=10;
					healthPoints.setText("HP: " + HP);
					mainStage.setScene(nodeScene5b.getScene());
					}});
					
			
			scene5dButton.setOnAction(event -> {
				Inventory.add(healthPotion);
				inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
    			inventoryLayout.getChildren().addAll(Inventory);
				healthPotion.setLayoutX(10);
				healthPotion.setLayoutY(60);
				informationAlert.setTitle("New Item ");
				informationAlert.setContentText("Health potion added to inventory ");
				informationAlert.setHeaderText("");
				informationAlert.show();	
				mainStage.setScene(nodeScene5e.getScene());
					});
			
			scene5aTheSpearchoiceB.setOnAction(event -> {
				HP=0;
    			healthPoints.setText("HP: " + HP);
				mainStage.setScene(nodeScene5bb.getScene());
			});
			
			scene5baButton.setOnAction(event -> {
				mainStage.setScene(nodeScene5d.getScene());
			});
			
			scene5bbButton.setOnAction(event -> {
				mainStage.setScene(nodeScene4.getScene());
			});
			
			scene5caStrikeTheBeastAgain.setOnAction(event -> {
			if(pierceDamage>=2) {
				HP-=2;
				healthPoints.setText("HP: " + HP);
				mainStage.setScene(nodeScene5bb.getScene());	
			}
			else{
				HP-=5;
				healthPoints.setText("HP: " + HP);
				mainStage.setScene(nodeScene5b.getScene());
			}}); 
			
			scene5eButton.setOnAction(event -> {
				mainStage.setScene(nodeScene4.getScene());
			});

			scene61Button.setOnAction(event -> {
				mainStage.setScene(nodeScene100.getScene());
			});
			
			scene62Button.setOnAction(event -> {
				mainStage.setScene(nodeScene6b.getScene());
			});
			
			scene63Button.setOnAction(event -> {
				mainStage.setScene(nodeScene6c.getScene());
			});

			scene6bchoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene6d.getScene());
			});

			scene6cChoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene6b.getScene());
			});

			scene6cChoiceB.setOnAction(event -> {
				mainStage.setScene(nodeScene9.getScene());
			});

			scene6dchoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene6e.getScene());
			});
			
			scene6eChoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene6f.getScene());
			});
			
			scene6fChoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene6g.getScene());
			});
		
			scene6gChoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene8.getScene());
			});
			
			scene6gChoiceB.setOnAction(event -> {
				mainStage.setScene(nodeScene99.getScene());
			});
		
			scene8ChoiceA.setOnAction(event -> {
					HP = 10;
					Inventory.add(claymore);
					inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
					inventoryLayout.getChildren().addAll(Inventory);
					claymore.setLayoutX(10);
					claymore.setLayoutY(85);
					healthPoints.setText("HP: " + HP);
					informationAlert.setTitle("New Weapon ");
					informationAlert.setContentText("Claymore added to your inventory!");
					informationAlert.setHeaderText("");
					informationAlert.show();
				mainStage.setScene(nodeScene8a.getScene());
				});
			scene8aChoiceA.setOnAction(event -> {			
			mainStage.setScene(nodeScene8b.getScene());
			});
			scene8bChoiceA.setOnAction(event -> {
				if(slashDamage>4){
				mainStage.setScene(nodeScene8c.getScene());
			}
				else{
				mainStage.setScene(nodeScene8z.getScene());
			}
			});
			scene8bChoiceB.setOnAction(event -> {
				mainStage.setScene(nodeScene8d.getScene());
			});
			scene8cChoiceA.setOnAction(event -> {
				if(randNumber==1)
				mainStage.setScene(nodeScene8e.getScene());
				else{
				mainStage.setScene(nodeScene8z.getScene());
				}
			});



			scene8dChoiceA.setOnAction(event -> {
				if(slashDamage>2){
					mainStage.setScene(nodeScene8c.getScene());
				}
				else{
					mainStage.setScene(nodeScene8z.getScene());
				}
			});

			scene8dChoiceB.setOnAction(event -> {
				if(randNumber == 3){
					mainStage.setScene(nodeScene8z.getScene());
				}
				else{
					mainStage.setScene(nodeScene8e.getScene());
				}
			});
			scene8eChoiceA.setOnAction(event -> {
				mainStage.setScene(nodeSceneCredits.getScene());
			});
			
			scene9ChoiceA.setOnAction(event -> {
				inventoryLayout.getChildren().removeIf(node -> node instanceof Button);
				Inventory.clear();
				HP = 1;
				statStage.setScene(statScene);
				mainStage.setScene(nodeScene9a.getScene());

			});
			
			scene99ChoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene99a.getScene());
			});
			
			scene99AChoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene99b.getScene());
			});
			
			scene99AChoiceB.setOnAction(event -> {
				mainStage.setScene(nodeScene99c.getScene());
			});	
			
			scene100ChoiceA.setOnAction(event -> {
				mainStage.setScene(nodeScene100.getScene());
			});

			scene9aChoiceA.setOnAction(event -> {
				mainStage.setScene(nodeSceneCredits.getScene());
			});
			
			
			
				
		/*---------------Last Settings---------------*/
		mainStage.setScene(nodeRoot.getScene());
		mainStage.show();
		statStage.setScene(statScene);
		statStage.show();
		inventoryStage.setScene(inventoryScene);
		inventoryStage.show();

		
	}
		public static void main(String[] args) {
			launch(args);
		}
		
	


        
    

		}
		
		