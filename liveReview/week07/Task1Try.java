package week07;

public class Task1Try {

    public static void main(String[] args) {

        int row = 5;

        for (int i = 1; i <= row; i++) {
            int col =i;

            for (int j = 1; j <= i ; j++) {

                System.out.print(col + " ");
                col += row-j;

            }
            System.out.println();
        }
    }
}

/*
            1
			2 -"4"- 6                               : row-1                                 1
			3 -"4"- 7 -"3"- 10                      : row-1, row-2                          2 6
			4 -"4"- 8 -"3"- 11 -"2"-13              : row-1, row-2, row-3                   3 7 10
			5 -"4"- 9 -"3"- 12 -"2"-14 -"1"- 15     : row-1, row-2, row-3, row-4            4 8 11 13
                                                                                            5 9 12 14 15
 */