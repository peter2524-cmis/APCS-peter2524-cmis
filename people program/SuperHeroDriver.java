
import java.util.ArrayList;
public class SuperHeroDriver{
    public static void main(String[] args){
        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        FriedEggMan theINcrediblegrease = new FriedEggMan();
        theINcrediblegrease.setSuitColor("sickly yellow");
        theINcrediblegrease.setCape(true);
        AsteroidMan asMa = new AsteroidMan();
        asMa.setSuitColor("blue");
        asMa.setCape(true);
        TheIncredibleShoelace debil = new TheIncredibleShoelace();
        debil.setSuitColor("red");
        debil.setCape(false);
        heroes.add(theINcrediblegrease);
        heroes.add(asMa);
        heroes.add(debil);
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        int detracter = 0;
        for(int x = 0; x<capedHeroes.length; x++){
            for(int y = 0; y<capedHeroes[0].length; y++){
                if(heroes.get(x+y-detracter).isCaped() == true){
                    capedHeroes[x][y] = heroes.get(x+y);
                    heroes.remove(x+y);
                    detracter+=1;
                }else{

                }
            }
        }
        
        for(SuperHero hero: heroes){
            System.out.println(hero);
        }
        
        for(int x = 0; x<capedHeroes.length; x++){
            for(int y = 0; y<capedHeroes[0].length; y++){
                System.out.println(capedHeroes[x][y]);
            }
        }
    }
}