public class zeroDuplicator {

    public void duplicateZeros(int...numbers) {
        
        int arraySize = numbers.length;

        /*
        * originalIndex: This tracks the "current position" in the original array.
        ^ expandedIndex: This tracks the "position in the final modified array", considering duplicated zeros.
        */
        int originalIndex = 0;
        int expandedIndex = 0;

        //! First pass: To determine the last valid position in the modified array while handling duplicated zeros.
        while (expandedIndex < arraySize) {

            /*
            * If the current number is 0, we need to duplicate it. 
            * That means we must count an extra space in the modified array.
            * That’s why we add another expandedIndex += 1 for zeros only.
            */
            if (numbers[originalIndex] == 0) {
                expandedIndex += 1; 
            }

            /*
             * Every number (whether it’s 0 or not) must be placed in the modified array.
             * That’s why we always do "expandedIndex += 1" at the end of every loop.
                                            & and
             ^ Since we processed the current element, we move to the next element in the original array.
             ^ That’s why we always do originalIndex += 1.
             */
            originalIndex += 1;
            expandedIndex += 1;
        }

        //! Second pass: Copy elements backward while handling zero duplication

        /*
         * Since both "originalIndex" and "expandedIndex" are "out of bounds" after the first pass.
         * Now, we "decrement them" to "point to valid elements".
        */
        originalIndex -= 1; 
        expandedIndex -= 1;
        
        //^ Start from the "last element of the original array" and move backward. */
        while (originalIndex >= 0) {

            /*
            * We "copy the current element from originalIndex to expandedIndex" (unless expandedIndex is out of bounds).
            ^ Then, move "expandedIndex backward". 
            */
            if (expandedIndex < arraySize) {
                numbers[expandedIndex] = numbers[originalIndex]; //& Copy the element
            }
            expandedIndex -= 1;

            //^ If we found a zero
            if (numbers[originalIndex] == 0) {
                //* When we find a zero, we duplicate it
                if (expandedIndex < arraySize) {
                    numbers[expandedIndex] = 0; //* Store the duplicate zero
                }
                expandedIndex -= 1;
            }
            originalIndex -= 1;
        }

        // Print the modified array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        zeroDuplicator zd = new zeroDuplicator();
        zd.duplicateZeros(1, 0, 2, 0, 0, 5, 2, 3);
    }
}
