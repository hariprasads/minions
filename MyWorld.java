import greenfoot.*;

/**
 * Class MyWorld: sample world to show how to make use of my world super-class SWorld
 */
public class MyWorld extends SWorld
{

    /**
     * Creates a scrolling world using a main actor, a background, some obstacles, and a non-scrolling score.
     */
    public MyWorld()
    {    
        super(1000, 400, 1, 6000); // scroll world constructor call; last parameter is scroll width
        // in the following statement, the main actor is placed at (400, 342) in scroll area coordinates
        addMainActor(new Wombat(), 400, 342, 250, 300); // the last two int parameters are centered window x and y ranges
        GreenfootImage bg = new GreenfootImage("World3Bg.png");
        setScrollingBackground(bg); // set the scolling background image
        // add other scrollable objects using scroll area coordinates
        addObject(new Ground(), 500, 390);
        
        // use of the following also adds scrollable objects using scroll area coordinates
        addObject(new Box(), 680, 450, true); // the boolean determines scrollable state
        // use the following for non-scrollable objects using window coordinates (not scroll area coordinates)
        addObject(new Score(), 40, 390, false);
         addObject(new Ground(), 100, 390);
        addObject(new Ground(), 300, 390);
        //addObject(new Evilminion(), 182, 358);
        //addObject(new Block(), 332, 358);

        addObject(new Castlebricks(), 150, 290);
        addObject(new Block(), 182, 290);
        addObject(new Brick(), 214, 290);
        addObject(new Brick(), 225, 170);
        addObject(new Block(), 257, 170);
        addObject(new Castlebricks(), 289, 170);
        addObject(new Castlebricks(), 300, 290);
        addObject(new Block(), 332, 290);
        addObject(new Castlebricks(), 364, 290);
        
        addObject(new Ground(), 1100, 390);

        addObject(new Castlebricks(), 950, 358);
        addObject(new Castlebricks(), 950, 326);
        addObject(new Castlebricks(), 950, 294);

        //addObject(new Ghoomba(), 1050, 358);
        //addObject(new Ghoomba(), 1200, 358);

        addObject(new Castlebricks(), 1050, 170);
        addObject(new Block(), 1125, 294);
        addObject(new Castlebricks(), 1200, 170);

        addObject(new Castlebricks(), 1300, 358);
        addObject(new Castlebricks(), 1300, 326);
        addObject(new Castlebricks(), 1300, 294);
        
        addObject(new Castlebricks(), 1500, 294);

        addObject(new Ground(), 1900, 390);

        addObject(new Castlebricks(), 1615, 358);

        addObject(new Block(), 1868, 290);
        addObject(new Castlebricks(), 1900, 290);
        addObject(new Block(), 1932, 290);

        //addObject(new Ghoomba(), 1800, 358);
        //addObject(new HammerBro(), 2000, 358);

        addObject(new Castlebricks(), 2185, 358);
        
        
        addObject(new Ground(), 2632, 390);
        addObject(new Ground(), 3200, 390);

        addObject(new Castlebricks(), 2347, 358);

        addObject(new Castlebricks(), 2550, 290);
        addObject(new Castlebricks(), 2582, 290);
        addObject(new Castlebricks(), 2614, 290);
        addObject(new Castlebricks(), 2646, 290);
        addObject(new Castlebricks(), 2678, 290);
        addObject(new Castlebricks(), 2710, 290);
        addObject(new Castlebricks(), 2742, 290);
        addObject(new Castlebricks(), 2742, 258);
        addObject(new Castlebricks(), 2550, 258);
        addObject(new Castlebricks(), 2550, 226);
        addObject(new Castlebricks(), 2550, 194);
        addObject(new Castlebricks(), 2550, 162);
        addObject(new Castlebricks(), 2550, 130);
        addObject(new Castlebricks(), 2550, 98);
        addObject(new Castlebricks(), 2550, 66);
        addObject(new Castlebricks(), 2582, 66);
        addObject(new Castlebricks(), 2614, 66);
        addObject(new Castlebricks(), 2646, 66);
        addObject(new Castlebricks(), 2678, 66);
        addObject(new Castlebricks(), 2710, 66);
        addObject(new Castlebricks(), 2742, 66);
        addObject(new Castlebricks(), 2742, 258);
        addObject(new Block(), 2630, 162);
        addObject(new Block(), 2662, 162);
        //addObject(new Ghoomba(), 2582, 258);
        //addObject(new Ghoomba(), 2710, 258);

        //addObject(new KoopaKid(), 2700, 358);

        addObject(new Castlebricks(), 2840, 290);
        addObject(new Castlebricks(), 2872, 290);

        addObject(new Castlebricks(), 3000, 358);
        addObject(new Castlebricks(), 3000, 326);
        addObject(new Castlebricks(), 3000, 294);

        //addObject (new HammerBro(), 3100, 358);

        addObject(new Castlebricks(), 3485, 358);
        addObject(new Castlebricks(), 3485, 326);
        addObject(new Castlebricks(), 3485, 294);
        addObject(new Castlebricks(), 3453, 358);
        addObject(new Castlebricks(), 3453, 326);
        addObject(new Castlebricks(), 3421, 358);
        
        
         addObject(new Ground(), 3950, 390);
        addObject(new Ground(), 4244, 390);

        addObject(new Castlebricks(), 3665, 358);
        addObject(new Castlebricks(), 3665, 326);
        addObject(new Castlebricks(), 3665, 294);
        addObject(new Castlebricks(), 3697, 358);
        addObject(new Castlebricks(), 3697, 326);
        addObject(new Castlebricks(), 3729, 358);

        //addObject(new KoopaKid(), 3950, 358);

        addObject(new Block(), 3929, 290);

        addObject(new Castlebricks(), 4129, 358);
        addObject(new Castlebricks(), 4129, 326);
        addObject(new Castlebricks(), 4129, 294);
        addObject(new Castlebricks(), 4129, 0);
        addObject(new Castlebricks(), 4129, 32);
        addObject(new Castlebricks(), 4129, 64);
        addObject(new Castlebricks(), 4129, 96);
        addObject(new Castlebricks(), 4129, 128);
        addObject(new Castlebricks(), 4129, 160);
        addObject(new Castlebricks(), 4129, 192);

        //addObject(new Ghoomba(), 4200, 358);
        //addObject(new Ghoomba(), 4300, 358);
        //addObject(new Ghoomba(), 4400, 358);
        //addObject(new Ghoomba(), 4495, 358);
        addObject(new Block(), 4329, 290);

        addObject(new Castlebricks(), 4529, 358);
        addObject(new Castlebricks(), 4529, 326);
        addObject(new Castlebricks(), 4529, 294);
    }
}
