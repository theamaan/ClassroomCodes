// We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.
public class MakeBrick {
    public static void main(String[] args) {
        MakeBrick mb = new MakeBrick();
        System.out.println(mb.makeBricks(3, 1, 8)); // true
        System.out.println(mb.makeBricks(3, 1, 9)); // false
        System.out.println(mb.makeBricks(3, 2, 10)); // true
        System.out.println(mb.makeBricks(3, 2, 8)); // true
        System.out.println(mb.makeBricks(3, 2, 9)); // false
        System.out.println(mb.makeBricks(6, 1, 11)); // true
        System.out.println(mb.makeBricks(6, 0, 11)); // false
        System.out.println(mb.makeBricks(1, 4, 11)); // true
        System.out.println(mb.makeBricks(0, 3, 10)); // true
        System.out.println(mb.makeBricks(1, 4, 12)); // false
        System.out.println(mb.makeBricks(3, 1, 7)); // true
        System.out.println(mb.makeBricks(1, 1, 7)); // false
        System.out.println(mb.makeBricks(2, 1, 7)); // true
        System.out.println(mb.makeBricks(7, 1, 11)); // true
        System.out.println(mb.makeBricks(7, 1, 8)); // true
        System.out.println(mb.makeBricks(7, 1, 13)); // false
        System.out.println(mb.makeBricks(43, 1, 46)); // true
        System.out.println(mb.makeBricks(40, 1, 46)); // false
        System.out.println(mb.makeBricks(40, 2, 47)); // true
        System.out.println(mb.makeBricks(40, 2, 50)); // true
        System.out.println(mb.makeBricks(40, 2, 52)); // false
        System.out.println(mb.makeBricks(22, 2, 33)); // false
        System.out.println(mb.makeBricks(0, 2, 10)); // true
        System.out.println(mb.makeBricks(1000000, 1000, 1000100)); // true
        System.out.println(mb.makeBricks(2, 1000000, 100003)); // false
        System.out.println(mb.makeBricks(20, 0, 19)); // true
        System.out.println(mb.makeBricks(20, 0, 21)); // false
        System.out.println(mb.makeBricks(20, 4, 51)); // false
        System.out.println(mb.makeBricks(20, 4, 39)); // true
    }

    public boolean makeBricks(int small, int big, int goal) {
        //Failure 1:-> When there aren't enough bricks available
        if (goal > big * 5 + small) {
            return false;
        }
        //Failure 2:-> When there isn't small bricks available
        if (goal % 5 > small) {
            return false;
        }

        return true;
    }
}
