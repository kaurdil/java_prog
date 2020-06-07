import java.io.*; 

class Star_Pattern {
    int n, size; 
    boolean matrix[][]; 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void input() throws IOException {
        System.out.print("Enter a number: ");
        n = Integer.parseInt(br.readLine()); 
    }

    void process() {
        size = 2 * n - 1; 
        matrix = new boolean[size][size]; 
        for (int i = 0; i < size; i++) {
            matrix[i][i] = matrix[i][size - 1 - i] = true; 
        }
    }

    void display() {
        for (int i = 0; i < size; i++) { 
            for (int j = 0; j < size; j++) { 
                if (matrix[i][j]) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
    }

    public static void main(String args[]) throws IOException { 
        Star_Pattern obj = new Star_Pattern(); 

        obj.input();
        obj.process();
        obj.display();
    }
}