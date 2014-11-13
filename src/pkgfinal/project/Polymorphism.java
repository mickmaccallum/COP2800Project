
package pkgfinal.project;

public class Polymorphism {
    
    private class Box {

	int width;
	int height;
	int depth;

        public Box() {
            width = 1;
            height = 1;
            depth = -1;
        }
    
        public Box(int val) {
            width = val;
            height = val;
            depth = val;
        }
    
        public Box(int w, int h, int d) {
            width = w;
            height = h;
            depth = d;
        }

	int volume() {
            return width * height * depth;
	}
    }

    class ConstructorOverloading {

	public void main() {
            Box mybox1 = new Box(10, 20, 15);
            Box mybox2 = new Box();
            Box mycube = new Box(7);

            int vol;

            vol = mybox1.volume();
            System.out.println("Volume of mybox1 is " + vol);

            vol = mybox2.volume();
            System.out.println("Volume of mybox2 is " + vol);

            vol = mycube.volume();
            System.out.println("Volume of mycube is " + vol);
	}
    }
    
    class Overload {   
        public void test(int val1) {
            System.out.println("a " + val1);
        }

        public void test(int val1, int val2) {
            System.out.println("a and b " + val1 + " " + val2);
        }
    
        public int test(char c) {
            System.out.println("char " + c);
            return (int)c;
        }
    }   
   
    class MethodOverloading {   
	
        public void main() {   
            Overload overload = new Overload();   
            
            overload.test(10);   
            overload.test(10, 20);   
            
            int result = overload.test('a');   
            System.out.println("Result " + result);   
	}   
    }   
}
