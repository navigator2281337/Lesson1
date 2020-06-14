package Sets;

import Products.Paper;
import Products.Pen;
import Products.Pencil;


public class Beginner extends Sets {

    public void Create()
    {
        System.out.println("Набор Новичка создан успешно");
    }

    @Override
    public String toString() {
        return "Beginner{} " + super.toString();
    }
}




class Sets extends Pen {
    class Sets2 extends Pencil{
        class Sets3 extends Paper{

        }
    }
}



