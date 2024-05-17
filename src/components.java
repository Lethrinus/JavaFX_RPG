import java.util.LinkedList;
import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.*;

public interface components {


	LinkedList<Button>Inventory = new LinkedList<>();
	
		Random rand = new Random();
	
	AnchorPane mainLayout = new AnchorPane();
		AnchorPane inventoryLayout = new AnchorPane();
		AnchorPane statLayout = new AnchorPane();
		AnchorPane scene1PrologueLayout = new AnchorPane();
		AnchorPane scene2Prologue2Layout = new AnchorPane();
		AnchorPane scene3JustEnteredKingdomLayout = new AnchorPane();
		AnchorPane scene4OnTheRoadLayout = new AnchorPane();
		AnchorPane scene5AtTheInnLayout = new AnchorPane();
		AnchorPane scene5aTheSpearLayout = new AnchorPane();
		AnchorPane scene5BoarKilledYouLayout = new AnchorPane();
		AnchorPane scene5bbKilledBoarLayout = new AnchorPane();
		AnchorPane scene5cSwordAttackLayout = new AnchorPane();
		AnchorPane scene5dInsideTheInnLayout = new AnchorPane();
		AnchorPane scene5eNothingMoreInTheInnLayout = new AnchorPane();
		AnchorPane scene6WhoGoesThereLayout = new AnchorPane();
		AnchorPane scene6bFoundSomeAlliesLayout = new AnchorPane();
		AnchorPane scene6cShouldveToldThemLayout = new AnchorPane();
		AnchorPane scene6dOldTimesSakeLayout = new AnchorPane();
		AnchorPane scene6eBadNewsLayout = new AnchorPane();
		AnchorPane scene6fGlimpseOfHopeLayout = new AnchorPane();
		AnchorPane scene6gEndOfLongTalksLayout = new AnchorPane();
		AnchorPane scene8BeginningOfMissionLayout = new AnchorPane();
		AnchorPane scene99RidingWithGallantLayout = new AnchorPane();
		AnchorPane scene99aLastBattleLayout = new AnchorPane();
		AnchorPane scene99bEpicDeathLayout = new AnchorPane();
		AnchorPane scene99cCowardDeathLayout = new AnchorPane();
		AnchorPane scene100dumbDeathLayout = new AnchorPane();
		AnchorPane scene9PushingHisLuckLayout = new AnchorPane();
		AnchorPane scene9aCaptiveAgainLayout = new AnchorPane();
		AnchorPane scene8aWayToHadrianKeepLayout = new AnchorPane();
		AnchorPane scene8bTheDarkKnightLayout = new AnchorPane();
		AnchorPane scene8cDarkKnightDoesNotFallLayout = new AnchorPane();
		AnchorPane scene8zDeathInDarknessLayout = new AnchorPane();
		AnchorPane scene8dDefenciveStanceLayout = new AnchorPane();
		AnchorPane scene8eTheEndLayout = new AnchorPane();
		AnchorPane sceneCreditsLayout= new AnchorPane();


Text storyTextCredits = new Text("Thank you for playing the game! \n \n \n Ozan Halis Demiralp \n \n \n Yavuzhan Özbek");
Text storyText8e = new Text("With the help of gods, or luck, or adrenaline; Sebastian was able to escape the black horror. "
		+ " Whatever it was, it was a foe that cannot be killed by a usual weapon. Sebastian rode his horse for a time that felt  "
		+ " like hours to him, and only stopped upon seeing Hadrian’s Keep on the horizon…");
Text storyText8d = new Text("Black figure attacked Sebastian with an unexpected speed, but old knight was able to "
	    + "get out of flaming swords way. Sebastian’s move fooled his opponent, and there he saw an opening. "
		+ "Whatever this creature was, it was no match against a seasoned knigt like Sebastian.");	
Text storyText8z = new Text("Sebastian’s effort was meaningless. Dark figure caught him with its hand;"
		+ "and killed the old knight there, alone in the darkness. Perhaps he should’ve been more careful, for night is dark and full of terrors.");
Text storyText8c = new Text("With a quick slash of his weapon, Sebastian attacked his opponent. But when steel meet chain,"
		+ "it was repelled by some kind of magic. Sebastian’s sword hand was as cold as ice, and he dropped down his sword. "
		+ "Black creature raised his flaming sword, and wounded Sebastian severely. Sebastian had to run…");
Text storyText8b = new Text("Dark figure stood silent for a moment, like it was trying to understand Sebastian’s words"
		+ "Only then he spoke with a voice as deep as abyss: “Don’t you know death when you see it, old man?”"
		+ "Without waiting for a response it drew its sword, with some kind of magic sword started burning,"
		+ "illuminating dark figures body. He was 8, maybe 9 feet tall; and was wearing a black chainmail armor."
		+ " Sebastian felt some kind of fear, not the kind he got used to on the battlefield. "
		+ "Whatever he was against it was not from this world…");
Text storyText8a = new Text("Hadrian’s Keep was at 4 days ride. At peaceful times, it would be a pleasant "
        + "journey through countryside. But times of civil war was the opposite, dangerous than ever."
        + "Sebastian rode through his homeland, seeing burned villages and sacked cities from afar. "
        + "Seeking old roads and stumbling upon new ones, thinking about his youth at here, his homeland. "
       + "One night, when he was full of thoughts again, Sebastian heard a strange sound." 
       + "He turned his horse and saw an intimidating figure, taller than Sebastian on horse and broader than a bear; a dark figure was looking at him from darkness. ");
Text storyText9a = new Text("But, as the enemy officer was identifying the captives, Sebastian saw him. The Usurper was there."
       + "They came eye to eye, and Usurper was not late to recognize him. “A captive of old Gallant, what a shame!"
       + " Great knight Sebastian Selmy, returning to his kingdom after years during war time. Only to rape and"
       + " pillage and plunder so much he will be taken prisoner by his old friends! Hah!"
       + "Take this scum into Hadrian Keep, there he shall find his bloody King’s son!” Rest was long days of agony and regret,"
       + " as they marched him to Hadrian Keep. Sebastian was so ashamed of his mistake, he was thinking about killing himself."
       + "But if late King’s son was imprisoned, perhaps there was a way to redeem himself…");
Text storyText9 = new Text("But it was appearant that they were not buying it. Their Lord,"
       + "a man close to Sebastian’s age gave the order: “Arrest this fool!” Sebastian knew there was no point in resisting." 
       + "They took his horse, his weapons and his armor away and chained him. Only then he learned from other prisoners," 
       + "that this host was at the side of Heir. But there was no way to convince any guard, so Sebastian had to wait." 
       + "For 3 days they marched south down the King’s Road. Sebastian realised they were going to Rainhall,"
       + " but they never made it there. It was under siege when they arrived, and sieging army crushed"
       + " Sebastian’s captors in a single battle. He was hoping to be freed by the winning side, but…");
Text storyText100 = new Text("For some reason, Sebastian drew his sword. They did not understand what he was planning"
       + " to do until Sebastian chopped one’s head off. Only then they drew their swords as well. Then, well, they killed him."
       + " Sebastian will be remembered as the “Insane Old Knight” who killed Lord Gallant, for some reason.");
Text storyText99C = new Text("Sebastian turned his back to the knight facing him and started running. He had never knew this much fear,"
		+ " but certainty of death had overwhelmed him. He saw the rear of battle, and thought he was making it out alive."
		+ "But he was wrong. An arrow found his neck, its bite was red and cold. History will forget Sebastian, or at best will remember him as a coward.");
Text storyText99B = new Text("Sebastian faced his first opponent, a knigt from Southern Lands, and shoved his sword right into his chest."
		+  "His face covered with mud and his fallen enemys blood, Sebastian looked around to find another prey. "
		+ "With each slash and strike of his sword he felt more alive than he ever did. He killed his way through the battlefield, "
		+ "to the point entire steel sword was covered by blood. He saw Gallant’s banner falling down, most likely with him. "
		+ "Then he found himself surrounded by enemies, but he fought to the bitter end. One arrow can slain a man, "
		+ "and Sebastian was pierced by many at the end. He shall be remembered in songs as a loyal man.");	
Text storyText99A = new Text("But Gallant did not seem to be hearing Sebastian. He said “If i was alone, i’d run to the hills like a coward."
		+  "But with you by my side, i shall live and die in glory.” He turned to his commanders, “Sound the attack horn, forth, forth and attack!”"
		+  "Sebastian had no choice but to follow Gallant. They crushed into enemy lines, and quickly got overrun by them."
		+ "Sebastian’s horse died, and he found himself in the mud. He drew his sword, and remembered his oath.");
Text storyText99 = new Text("Thus Sebastian started riding with the host of Lord Gallant. 3 days they marched down south by King’s Road"
		+ ". Now that they were outnumbered 10 to 1, they meant to take defensive positions. But they were never able to do so."
		+ " Fourth day they arrived at Rainhall, keep of Lord Gallant, only to find it under siege. "
		+ " Sebastian rode to Gallant’s side to prevent his friend from doing something stupid…");
Text storyText8 = new Text("Lord Gallant gave some orders to his men and returned back to Sebastian." 
		+ "They will give you a better horse than this one, and some weapons and medicine."
		+ "I will not say don’t go, but i must say that this may very well end with your death, friend."
		+ " Sebastian looked away for a moment, remembering the day he became a knight,"
		+ "“Then i shall die trying, Gallant. I did not become a sworn knight to die at an inn, drowning in wine."
		+ "I shall die trying, or i shall win this war for you.” “You are still that fierce young men i knew, Sebastian.” "
		+ "said Gallant,  “I wish you good fortune in the wars to come Sir.” Sebastian answered:"
		+ " “I might be fierce still, but not that young my lord. And i do not think i’ll see another war,"
		+ " this will be my last either way.” With these words Sebastian…");
Text storyText6g = new Text("Lord Gallant spoke: “They are holding him in the prisons of Great Hadrian.” Gallant’s eyes studied his friend, "
			+ "“You wish to free him?” he asked, half joking half serious. Sebastian said…");
Text storyText6f = new Text("Lord Gallant answered bitterly: “There is hope, my friend. If we could somehow free the Heir, it would change the tide. "
            + "Some of neutral lords could declare for our cause, and Heir’s military might would start winning us battles as it did at the first days of war.” "
            + "Sebastian saw there was stil something for him to do…");
Text storyText6e = new Text("“Yes”, Sebastian said “I remember the harsh winters of our Kingdom damn well. But you seem troubled my friend. There seems to be more to your story, more than some muddy roads.” “Aye” Lord Gallant continued, “During that unspoken truce, they were actually preparing for something big. We were careless, we believed so much in this so called “truce”. "
            + "One night, they passed between our lines with a big host, stroke Heir’s camp and took him prisoner.” A shadow fell on Lord Gallant’s face, "
            + "“Most of our Lords immediatly bent the knee and joined the enemy, now there is only so few of us remaining, and Heir is still imprisoned. "
            + "We are outnumbered 10 to 1, and i am afraid we are losing this war.” Sebastian said…");
Text storyText6d = new Text("They joined back to Lord Gallant’s host, and started riding together. Lord Gallant spoke: “6 months ago, he came back. Heir to our late King, he came back with a huge army of his own. "
            + "We couldn’t believe our eyes, but it was true that he escaped the day King’s Halls fell to the enemy . Most of the lords declared for Usurper, but me and some loyal ones; we declared for the Heir. "
            + "At first, we were winning victory after victory. War would end soon, we thought. But we were wrong. Winter hitted the Kingdom hard. "
            + "Roads were so muddy and weather was so bad, there was an unspoken truce. There was no way for armies to march at that conditions.”");
Text storyText6c = new Text("One of the man studied Sebastian for some time. “I do not think you are a harmless traveler, old man."
		 + " Going around wearing an armor, carrying a sword during war-time and claiming you are harmless. I don’t buy it.” "
		 + " Sebastian was taken aback by man’s attitude, as he was trying to find an answer one of them drew his sword:"
		 + " “Who do you serve, old man!”. Only then Sebastian decided to tell them…");
Text storyText6b = new Text("One of the cavarlymen, and old man like Sebastian, marched his horse forward, taking a good look into Sebastian’s eyes. "
				+ "“Aye, i know you great sir! We fought together at Battle of the Red Ford, we lost but we fought good. "
				+ "I’d never thought i’d see you again in my lifetime. But i was wrong.” Sebastian studied the man, and like remembering a memory from childhood he remembered his old comrades face…");
Text storyText6Text = new Text("As soon as Sebastian entered approaching hosts view, they stopped and sent out riders to meet this stranger."
                + "3 armored cavarlymen rode to meet Sebastian. Their leader, much likely a lord, asked him: “Who goes there?” Sebastian… ");
Text storyText5eText = new Text("Sebastian looked around a little longer but did not see anything he could pick, and he decide to… ");
Text storyText5dText = new Text("Sebastian had entered the inn, with hopes of finding someone alive. " 
                + "But there was not a single soul, place was partly burned and entirely empty. "  
                + "As he was going through shelves to find something useful, he saw some medicine.");
Text storyTextYouKilledBoar = new Text("Old he was, but soldiers do not get old thanks to luck. With a quick and single strike of his weapon, "+
                "Sebastian teared the boars skin apart and killed it with ease. After that he looked around and decided to…");
Text storyTextYouSword = new Text("Sebastian swinged his weapon as best as he could, and indeed he was good, but it was not enough. It bounced back from boars strong skin, "
		+ "and as soon as it was out of danger boar attacked Sebastian with its teeth. Sebastian’s armor saved his life, barely.");
Text storyTextBoarKilledYou = new Text("Sebastian was overpowered by the beast… It jumped on him, crushed to his plate armour and killed the old knight. "
				+ "This one won’t end up in a song, i guess.");
Text storyText5a = new Text("Sebastian weighted the old spear with his hand. It was not the work of a master blacksmith, most likely it was rushed out for the war by an amateur, but it could be useful. "
				+ "As he was trying to understand its balance, a wild boar appeared out of nowhere! Sebastian was old, and boar was fast; "
				+ "so there was no way to run. But he was a sworn knight and he knew how to swing a sword or use a spear!");
Text storyText5 = new Text("Sebastian saw the size of slaughter as he got close. There were both soldiers and common folk murdered all around, inn was partly burned and its garden was ruined. "
				+ "Next to the corpse of a soldier, Sebastian saw “Basic Spear”. He decided to…");
Text storyText4 = new Text("As he kept going, traces of war became more appearent. It was not so later he heard the sound of marching men, coming into his way. "
				+ "He had no idea who was marching and whose side they were holding, so he decided to…");
Text storyText3 = new Text("It was a fortnigth now since Sebastian had entered his Kingdom, but he had not seen any soldier nor anyone living yet. "
				+ "Here and there there were traces of war, slaughtered animals or dead people. "
				+ "But no one living. It was like the civil war had killed everyone in the Kingdom. Not far away from road, Sebastian saw smoke rising. "
				+ "He remembered that there used to be an inn around here, and he decided to…");
Text storyText2 = new Text("It was a cold winter night when Sebastian heard the news from his homeland. He was staying at an inn, thinking about old days "
				+ "and all the years he had spent as a sellsword. But the news were marvellous! If what he heard was true, then maybe it was time for him to keep the promises he made to himself (?). "
				+ "Word was that some of the lords of his kingdom had rebelled against the usurper, under the banner of Sebastian’s late King’s heir. "
				+ "With these news, Sebastian found will to live again. He got on his horse, and started galloping back home…");
Text storyText1 = new Text("Sebastian Selmy fought for his king valiantly, whilst most of the lords of the kingdom took arms against him. "
				+ "Sebastian fought bravely, but Sebastian lost. Afraid to lose his head as well, he went into exile; wandering at different kingdoms. "
				+ "For years he worked as a sellsword, as a common soldier. He always promised himself one day, he would return. Years followed years, "
				+ "and eventually Sebastian grew into an old and bitter man. "
				+ "He had already realised all the promises he gave to himself was for nothing, but he never forgot his true identity as a sworn Knight of his late King.");
Text welcomeText = new Text("Welcome to the game!");
				Button playAgain = new Button("Play again.");
				Button knightSword = new Button("Knights Sword");
				Button infantrySpear = new Button("Infantry Spear");
				Button healthPotion = new Button("Health Potion");
				Button claymore = new Button("Claymore");
				Button gameOver = new Button("Game over");
				Button gameOver1 = new Button("Game over");
				Button gameOver2= new Button("Game over");
				Button gameOver3 = new Button("Game over");
				Button gameOver4 = new Button("Game over");
			
				Button scene8eChoiceA = new Button("Game Finished.");
				Button scene8dChoiceA = new Button("Attack the creature, using the opening. ");
				Button scene8dChoiceB = new Button("Run away, this might be your only chance to do so!");
				Button scene8zChoiceA = new Button("Game Over");
				Button scene8cChoiceA = new Button("Run for your life..");
				Button scene8bChoiceA = new Button("“Devil or human, non can stand my wrath!”. Sebastian attacks \nthe creature with all his strength.");
				Button scene8bChoiceB = new Button("“This foe appears to be unusual, i shall approach him carefully”. \n Sebastian will take a defensive stance against the creature.");
				Button scene8aChoiceA = new Button("Call out “Who goes there! State your businnes \n or face the wrath of my sword!”.");
				Button scene9aChoiceA = new Button("Game Finished!");
				Button scene9ChoiceA = new Button("Continue...");
				Button scene100ChoiceA = new Button("Game Over");
				Button scene99cChoiceA = new Button("Game Over");
				Button scene99bChoiceA = new Button("Game Over!");
				Button scene99AChoiceA = new Button("I grew up with soldiers, i learned how to die a long time ago");
				Button scene99AChoiceB = new Button("No, i cannot die like this; i cannot. I must find a way to run away!");
				Button scene99ChoiceA = new Button("“My lord! We cannot beat this army in open field! \n We must retreat back to marshes or we will lose everything.”");
				Button scene8ChoiceA = new Button("Drove his horse away from Gallant, took the necessary items from men, \n and started riding for Hadrian Keep.");
				Button scene6gChoiceA = new Button("“I am no good for our cause here, my friend. I won’t change \n the course of war by standing at your side, perhaps \n we will make a last stand which is good for the songs;\n but that’s all. I will do what i must.”.");
				Button scene6gChoiceB = new Button(	"“Ah, if i was still a green boy i’d say yes. But it \n does not seem possible, my friend. \nIt is best i stick with you.”");
				Button scene6fChoiceA = new Button("“Which castle are they holding him at? \n Do you have any knowledge?”");
				Button scene6eChoiceA = new Button("“If i was still a green boy, i’d say keep fighting. But it is not \n dishonorable to bent the knee when there is no hope, \n my friend.”");
				Button scene6dchoiceA = new Button("Continue...");
				Button scene6cChoiceA = new Button(" “I am a sworn knight of our late king, who was deposed\n  by the Usurper.  Now i have returned back to fight for his \n heir, because my vows are taken for life.");
				Button scene6cChoiceB = new Button("“I am speaking the truth, lads. I am just an old and weary traveller.”");
				Button scene6bchoiceA = new Button("“Lord Gallant! Years have did us no good, but your eyes \n see better than mine still. It is so good finding an ally, \n an old friend in this troubled times! Tell me of war, will you? \n What happened while i was away?”.");
				Button scene61Button = new Button("Remembered his young days and attacked the strangers!");
				Button scene62Button = new Button("Answered “I am a sworn knight of our late king, who was deposed by \n the Usurper.  Now i have returned back to fight for his heir, \n because my vows are taken for life..");
				Button scene63Button = new Button("Answered “I am a traveler going through these lands. I am an \n old, harmless man and i wish to go on my way, my lord");
				Button scene5eButton = new Button("Return the road.");
				Button scene5dButton = new Button("Take the medicine");
				Button scene5baButton = new Button("Head into the inn");
				Button scene5bbButton = new Button("Don't bother with the inn and return to the road (skip rest of the tutorial)");
				Button scene5caStrikeTheBeastAgain = new Button("Strike the beast again, this time kill kim for good.");
				Button scene5aTheSpearchoiceA = new Button("Attack the boar with a quick strike!");
				Button scene5aTheSpearchoiceB = new Button("Stay still and wait for the boar to make a move!");
				Button scene5AtTheInnchoiceA = new Button("Take it.");
				Button scene4OnTheRoadchoiceA = new Button("Wait at somewhere visible and confront whoever is coming.");
				Button scene3JustEnteredKingdomchoiceA = new Button("Forget about the inn and keep to the road (skip the tutorial).");
				Button scene3JustEnteredKingdomchoiceB = new Button("Go and see what happened to the inn (tutorial).");
				Button scene2Prologue2choiceA = new Button("Continue...");
				Button scene1ProloguechoiceA = new Button("Continue...");
				Button startPlayingButton = new Button("Start the Game");
		
}
