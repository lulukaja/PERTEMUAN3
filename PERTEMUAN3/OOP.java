/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN3;

/**
 *
 * @author LULUK
 */
// player 
class Player{
   String name;
   double health;
   int level;
   // object member
   Weapon weapon;
   Armor armor;

   Player(String name, double health, int level){
      this.name = name;
      this.health = health;
      this.level = level;
   }

   void equipWeapon (Weapon weapon){
      this.weapon = weapon;
 
   }
   void equipArmor ( Armor Armor){
      this.armor = Armor;
   }

   void display (){
      System.out.println("\nName :" + this.name);
      System.out.println("Level  :" + this.level); 
      System.out.println("Health :" + this.health); 
      this.weapon.display();
      this.armor.display();
}

}

// senjata
class Weapon{
   double attackPower;
   String name;


   Weapon (String name , double attackPower){
      this.name = name;
      this.attackPower = attackPower;
   }
   void display(){
      System.out.println("Weapon : " + this.name + " , power : " + this.attackPower);
   }

}

// armor
class Armor{
   double defendPower;
   String name;

   Armor (String name , double defendPower){
      this.name = name;
      this.defendPower = defendPower;
   }
   void display(){
      System.out.println("Armor : " + this.name + " , defense : " + this.defendPower);
   }

}
public class OOP {
   public static void main(String[] args) {
      // membuat object player
      Player player1 = new Player ("aan",100, 15);
      Player player2 = new Player ("anwar",85, 12);

      // membuat object weapon
      Weapon pedang = new  Weapon ("pedang", 15);
      Weapon keris = new Weapon ("keris ", 7);

      // membuat object armor
      Armor bajuBesi = new Armor ("baju besi " ,10);
      Armor kaosOblong = new Armor ("Kaos Oblong ", 25);

      // equip senjata armor
      player1.equipWeapon(pedang);
      player1.equipArmor(bajuBesi);

      player2.equipWeapon(keris);
      player2.equipArmor(kaosOblong);


     player1.display();
     player2.display();
   }
}
