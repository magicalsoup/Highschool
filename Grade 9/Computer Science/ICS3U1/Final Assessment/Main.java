import java.util.Scanner; //imports scanner class
import java.util.Random; //import random class 

public class GameOf21 { 
  
  //Global variable/array declarations
  public static int cards[] = new int[52]; //array contains all cards in a deck of cards
  public static int cardsUsed[] = new int[52]; //array contains all cards in a deck of cards (tracks which cards have been dealt already that computer can see)
  public static Random generator = new Random(); //random number generator
  public static Scanner sc = new Scanner (System.in); //create scanner
  
  
  public static void main(String []args){ //main method
    
    String playerResponse = ""; //string holds user's input for whether or not they want to play again
    print_instruction(); //runs the instructions method that prints out the instructions to the user
    
    do{ //loop contains entire game; repeats if the user wants to play again
      int playerNumber = 0; //stores the sum of the players total cards
      int computerNumber = 0; //stores the sum of the computers total cards
      int numberOfCardsPlayed = 0; //counts the number of cards that have been dealt
      int playerAces = 0; //counts the number of aces the player has at any time
      int computerAces = 0; //counts the number of aces the computer has at any time
      boolean roundOver = false; 
      set_up_deck(); //go to method to initialize both deck of cards arrays
      
      //Dealing cards to computer
      int cardc1 = get_card(); //go to method to get numerical value that corresponds with first card
      int cardc2 = get_card(); //go to method to get numerical value that corresponds with second card
      
      //if the computer is dealt an ace as either one of their cards, the number of aces goes up by 1
      if(cardc1 == 1){ 
        computerAces++; //adds 1 to the aces the computer has
      }
      
      if(cardc2 == 1){
        computerAces++; //adds 1 to the aces the computer has
      }
      
      update_deck(cardc1); //removes the first card dealt to the computer from the card array
      update_deck(cardc2); //removes the second card dealt to the computer from the card array
      System.out.println();
      System.out.println("Computer's First Face-Up Card: " + get_card(cardc2)); //outputs to the user the second card of the computer and hides the first card
      System.out.println();
      numberOfCardsPlayed += 2; //adds 2 to the number of cards played (to help with computer AI)
      
      if(computerAces == 1 && (cardc1 > 10 || cardc2 > 10) || computerNumber == 21){ // check if computer was dealt a black jack
        System.out.println("The computer got an ace and a 10 - Computer Won!"); // print
        roundOver = true; // set roundOver to true
      }
      if(!roundOver){ // if roundOver is false
        //Dealing cards to the player 
        int cardp1 = get_card(); //go to method to get numerical value that corresponds with first card
        int cardp2 = get_card(); //go to method to get numerical value that corresponds with second card
        
        //if the player is dealt an ace as either one of their cards, the number of aces goes up by 1
        if(cardp1 == 1){ 
          playerAces++; //adds 1 to the aces the player has 
        }
        if(cardp2 == 1){
          playerAces++; //adds 1 to the aces the player has 
        }
        
        update_deck(cardp1); //removes the first card dealt to the player from the card array
        update_deck(cardp2); //removes the second card dealt to the player from the card array
        System.out.println("Here Are Your 2 Cards:");
        System.out.println(get_card(cardp1) + " and " + get_card(cardp2)); //outputs to the player their 2 cards
        
        playerNumber = playerNumber + convert(cardp1) + convert(cardp2); //calculates the sum of the total of the players cards after checking their value using method "convert"
        
        if(playerAces == 1 && (cardp1 > 10 || cardp2 > 10) || playerNumber == 21){ // check if computer was dealt a black jack
          System.out.println();
          System.out.println("You Won!"); // print
          System.out.println();
          roundOver = true; // set roundOver to true
        } else {
          System.out.println("Your Total Sum Is: " + playerNumber); //outputs the sum of the players cards to the player 
          System.out.println();
          update_cards_used(cardp2); 
          numberOfCardsPlayed += 2; //adds 2 to the number of cards played 
          
          //if player did not win off deal, update computer's score
          computerNumber = computerNumber + convert(cardc1) + convert(cardc2); //converts the two original dealt cards to the computer to ints and totals them
          update_cards_used(cardc1); //adds the first card to the cards used
          update_cards_used(cardc2); //adds the second card dealt to the cards used
        }
      }
      
      
      
      if(!roundOver){ //if the round isn't over
        round : while(true){ //while loops that runs for length of the round
          while(true){ 
            
            if(playerNumber > 21){ //if the sum of the players cards at any point goes over 21, they lose the round
              System.out.println("You Went Over 21"); //outputs to the user that their total is over 21
              break round; // ends the round
            }
            
            System.out.println("Would You Like Another Card? Enter y / n"); //prompts the user to `choose between getting another card or staying 
            String response;
            while (true){ //loop runs until valid input is entered
              response = sc.next();//stores the user response
              if (response.equals("y") || response.equals("n")){ //check if input is valid
                break;
              } else {
                System.out.println("Invalid input. Please enter y or n"); //prompt user to enter response again
              }
            }
            
            if(response.equalsIgnoreCase("n")){ //if the user chooses to stay, the round is over 
              break;
            }
            
            else if (response.equalsIgnoreCase("y")){ //otherwise, they recieve another card 
              int dealtCard = get_card(); //stores the new card into dealtCard by randomly generating a number
              update_deck(dealtCard); //removes the dealt card from the original deck 
              
              if(dealtCard == 1){ //if the rng returns a 1, the player receives an ace 
                playerAces++; //the number of aces the user has goes up
              }
              System.out.println();
              System.out.println("Your Dealt Card Is: " + get_card(dealtCard)); //outputs to the user the card they have been dealt
              System.out.println();
              playerNumber = playerNumber + convert(dealtCard); //converts the dealt card to an integer using convert method and adding it to the sum of the players cards
              numberOfCardsPlayed++; //adds 1 to the total number of cards played 
              System.out.println("Your Total Sum Is: " + playerNumber); //outputs the sum of the players cards to the player
              System.out.println();
              update_cards_used(dealtCard); //adds the new dealt card to the used card deck
            }
            
          }
          
          playerNumber = get_new_player_number(playerNumber, playerAces); // method asks the user what they want to do with their aces if they have aces in their hand 
          
          
          // computer turn
          
          while(true){ //loop contains computer's gameplay
            
            if(computer_chance(computerNumber, numberOfCardsPlayed)){ //calls the method computer_chance to see if the computer should get a card or not 
              //if computer_chance returns true, this runs 
              int dealtCard = get_card(); //the computer is dealt a card 
              
              if(dealtCard == 1){ //if the rng returns 1, the computer is dealt an ace 
                computerAces++; // adds one to the total number of aces the computer has 
              }
              
              update_deck(dealtCard); //removes the card dealt from the original deck 
              computerNumber += convert(dealtCard); //converts the dealt card to an integer and adds it to the total of the computer 
              update_cards_used(dealtCard); //adds the dealt card to the used cards pile 
              System.out.println();
              System.out.println("Computer Dealt Card: " + convert(dealtCard)); //outputs to the user the card the computer was dealt
              numberOfCardsPlayed++; //adds 1 to the total number of cards played 
            }
            
            if(computerNumber > 21){ //if the total sum of the computer's cards is over 21 at any point, this loops breaks and the round is over 
              System.out.println("The Computer Went Over 21!"); //tell user computer's sum is over 21
              break round;
            }
            
            if(!computer_chance(computerNumber, numberOfCardsPlayed)){ //if the computer decides there is a low chance of drawing a good card, it ends the round
              System.out.println();
              System.out.println("The computer does not want any more cards."); //tell user computer doesn't want another card
              break round;
            }
          } //end of loop containing computer gameplay
        } //end of loop containing a round of gameplay
        
        computerNumber = get_new_computer_number(computerNumber, computerAces); //changes the computer total if the computer has an ace and is over 21
        System.out.println();
        System.out.println("Player Sum: " + playerNumber); //outputs the total of the players cards
        System.out.println("The Computer's Face-Down Card was " + convert(cardc1)); //reveals what computer's card was
        System.out.println("Computer Sum: " + computerNumber); //outputs the total of the computers cards 
        System.out.println();
        System.out.println("The Winner Is: " + declare_winner(playerNumber, computerNumber) + "!"); //outputs the winner of the game using method declare_winner
        System.out.println();
      } //end of if statement for if round is not over
      System.out.println("Play Again? y / n"); //asks the user if they want to play again 
      //loop runs until the user enters a valid input            
      while (true){ 
        playerResponse = sc.next(); //stores the user response 
        if (!playerResponse.equalsIgnoreCase("y") && !playerResponse.equalsIgnoreCase("n")){ //if the user response is not one of the prompted options, it asks the user to enter another value
          System.out.println("Invalid Response. Please enter y / n"); //prompts the user to enter a valid input
        }else{
          System.out.println("Thank you for playing Game of 21!");
          break; //exit loop containing entire game
        }
      }
    }while(!playerResponse.equalsIgnoreCase("N")); //this loop will keep runnning until the user enters n 
    
    sc.close(); //closes the scanner 
    
  }
  
  //this method calculates the percentage chance that the computer will win if they draw
  public static boolean computer_chance(int computerSum, int numberOfPlayerCards){ 
    if(computerSum > 21){
      return false; //if the sum of the computers cards is over 21, it will return false
    }
    int numberOfValidCards = 0; 
    int computerDifference = 21 - computerSum; //calculates the threshold of the cards that the computer can draw without reaching over 21
    for(int i = 0; i < cardsUsed.length; i++){ 
      if(cardsUsed[i] != 0 && cardsUsed[i] <= computerDifference)
        numberOfValidCards++; //calculates the number of cards that haven't been used that are within the threshold 
    }
    
    
    if(numberOfValidCards / (52.0 - numberOfPlayerCards) * 100 >= 40){ //if the percentage chance is over 40%, the computer will draw
      return true; //returns true
    }
    
    //otherwise the computer will stay
    return false; //returns false 
    
  }
  
  //checks to see the closest possible sum the computer can get if they have aces in their hand
  public static int get_new_computer_number(int computerSum, int numberOfAces){ 
    for(int i = 0; i < numberOfAces; i++){
      
      //since aces are set to default a value of 1, the computer will have a choice whether to switch to 11 or not
      if(computerSum + 10 <= 21){ //if the computer sum is less than 21 - 10, the computer will change the ace to an 11
        computerSum += 10;
      }
      
      else { //otherwise it breaks
        break;
      }
    }
    return computerSum; //returns the new total of the computer cards  
  }
  
  //method to get a new card
  public static int get_card(){ 
    
    for(int times = 1; times <= 200; times++) {
      int randomIndex = generator.nextInt(52); //randommly generates a number between 0 and 52
      if(cards[randomIndex] != 0){ //if the card number isn't 0 it will return the array cards at the index of the rng
        return cards[randomIndex]; 
      }
    }
    
    for(int i = 0; i < cards.length; i++) {  //updates the size of the deck of cards
      if(cards[i] != 0){
        return cards[i];
      }
    }
    
    return -1;
  }
  
  //changes the value of the card to its value in the game
  public static int convert(int card){
    if(card < 10){
      return card; //if the card is less than 10 (a number card) it will return that value
    } else {
      return 10; //if the card is a face card (royal card), it will return 10
    }
  }
  
  //method to see what the player wants to do if they have aces 
  public static int get_new_player_number(int playerSum, int numberOfAces) { 
    for(int cnt = 1; cnt <= numberOfAces; cnt++) {
      System.out.println();
      System.out.println("This Is Your Sum Now: " + playerSum); //outputs the sum of the user's cards 
      System.out.println();
      System.out.println("What Would You Like The Value Of Your " + print_number_format(cnt) + " Ace To Be?"); //prompts the user to enter what they would like to do with their ace 
      System.out.println("11 / 1"); //they can either make the value a 1 or 11
      int numberChoice = 0;
      while(true){ //this loop runs until the user makes a valid entry 
        String input = sc.next();
        if(input.equals("11") || input.equals("1")){ //if the user enters a valid number this runs
          if(input.equals("11")){ //if the user chooses 11, the ace turns into an 11
            numberChoice = 11;
          }//otherwise the ace stays at its original set value of 1
          break;
        }
        System.out.println("Invalid Input. Please enter 11 / 1"); //if the user entered something invalid, it will keep prompting the user to enter a valid number 
      }
      System.out.println();
      if(numberChoice == 11){ //if the user chooses to switch the ace to an 11 
        playerSum += 10; //adds 10 to the player's total
      }
    }
    System.out.println();
    System.out.println("Your Final Sum Is Now: " + playerSum); //output updated sum of cards to user
    
    return playerSum; //returns the new player total
  } 
  
  //uses an rng to determine which card the user or computer will get when they are dealt a card
  public static String get_card(int card){
    
    if(card == 1){
      return "Ace"; //if rng returns 1, the user/computer is dealt an ace 
      
    } else if(card <= 10){
      return card + ""; //if rng returns anything from 0 - 10, the computer/user is dealt that number
      
    } else if(card == 11){ 
      return "Jack"; //if the rng returns 11, the computer/user is dealt a jack
      
    } else if(card == 12){ 
      return "Queen"; //if the rng returns 12, the computer/user is dealt a queen
      
    } else if(card == 13){ 
      return "King"; //if the rng returns 13, the computer/user is dealt a king
      
    } else {
      return "Unknown"; //error proofing the return
    }
  }
  
  //declares the winner based on their totals
  public static String declare_winner(int playerSum, int computerSum){ 
    
    if(playerSum >= 21 && computerSum >= 21){ //if both the computer and the player have sums of 21 or more, the computer wins by default
      return "Computer";
      
    } else if(playerSum > 21) { //if the player has a sum of over 21, the computer wins
      return "Computer";
      
    } else if(computerSum > 21){ //if the computer has a sum of over 21, the player wins
      return "Player";
      
    } else if(playerSum > computerSum){ //if the player has a sum higher than the computer, the player wins
      return "Player";
      
    } else if(computerSum > playerSum){ //if the computer has a sum higher than the player, the computer wins
      return "Computer";
      
    } else if(playerSum == computerSum){ //if player and computer have the same sum, the computer automatically wins
      return "Computer";
      
    } else {
      return "Computer"; //the computer wins in any other situation
    }
  }
  
  public static String print_number_format(int num){ //method returns appropriate word to output to user when referring to which ace they are choosing value for
    if(num == 1){ 
      return "First";
    } else if(num == 2){
      return "Second";
    } else if(num == 3){
      return "Third";
    } else {  
      return "Fourth";
    }
  }
  
  //method that prints out the instructions of the game 
  public static void print_instruction(){
    System.out.println("Welcome to the game 21!!");
    System.out.println("In this game, you will be playing against the computer. Both players will be dealt two cards from a deck. ");
    System.out.println("During each player's turn, they are given the option of getting dealt another card or not. The player's ");
    System.out.println("turn continues until they don't want anymore cards. Both players are able to see all the cards that are ");
    System.out.println("dealt excluding the very first card. Number cards have their face value. Ace can either be 1 or 11, ");
    System.out.println("based on the player's choice. All royal cards (king, queen, jack) are given a value of 10."); 
    System.out.println("If you get dealt a royal card and an ace, you automatically win. Otherwise, the player who has a total closest to 21 wins");
    System.out.println("that round. If your total goes over 21 at any point, you automatically lose that round. ");
    System.out.println("If both players have the same value, the computer automatically wins that round (as the computer is considered the dealer).");
    System.out.println();
    System.out.println("NOTE: When you are dealt an ace, the program will initaially assume the value is 1 when calculating the sum of your cards.");
    System.out.println("Once you are done getting all your cards, you will be able to choose whether your ace(s) have a value of 1 or 11.");
    System.out.println();
    System.out.println("GOOD LUCK!");
  }
  
  //updates the number of cards in the deck 
  public static void update_deck(int card) {
    
    for(int i = 0; i < cards.length; i++) { //loop runs through each element in cards array
      if(cards[i] == card) { //check if card being updated matches the one in the deck
        cards[i] = 0; //change value of element to 0 (indicates there is no card there)
        break;
      }
    }
    
  }
  
  //adds any dealt cards to the array cardsUsed so the computer can "count cards"
  public static void update_cards_used(int card){
    
    for(int i = 0; i < cardsUsed.length; i++){ //loop runs through each element in cardsUsed array
      if(cardsUsed[i] == card){ //check if card being updated matches the one in the deck
        cardsUsed[i] = 0; //change value of element to 0 (indicates there is no card there)
        break;
      }
    }
  }
  
  //sets up the deck so there are 4 cards with the same value, ranging from 1-13
  public static void set_up_deck(){
    int index = 0;
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 13; j++){
        cards[index] = (j + 1);
        cardsUsed[index] = cards[index];
        index++;
      }
    }
  }
}
