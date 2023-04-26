public class Array05 {
    public static void main(String[] args) {

        ItemForArray[] array1 = new ItemForArray[3];
        array1[0] = new ItemForArray(500, "사과");
        array1[1] = new ItemForArray(300, "바나나");
        array1[2] = new ItemForArray(900, "수박");


        ItemForArray[] array2 = new ItemForArray[]{new ItemForArray(500, "사과"), new ItemForArray(300, "바나나"), new ItemForArray(900, "수박")};
        ItemForArray[] array3 = {new ItemForArray(500, "사과"), new ItemForArray(300, "바나나"), new ItemForArray(900, "수박")};

        System.out.println("========array1==============");
        for (ItemForArray itemForArray : array1) {
            System.out.println("itemForArray.getPrice() = " + itemForArray.getPrice());
            System.out.println("itemForArray.getName() = " + itemForArray.getName());
        }

        System.out.println("========array2==============");
        for (ItemForArray itemForArray : array2) {
            System.out.println("itemForArray.getPrice() = " + itemForArray.getPrice());
            System.out.println("itemForArray.getName() = " + itemForArray.getName());
        }

        System.out.println("========array3==============");
        for (ItemForArray itemForArray : array3) {
            System.out.println("itemForArray.getPrice() = " + itemForArray.getPrice());
            System.out.println("itemForArray.getName() = " + itemForArray.getName());
        }



    }
}
