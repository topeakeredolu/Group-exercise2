package GroupTask;
public interface Mark {

    double getPercentage(int math, int chemistry, int physics);

    double getPercentage(int math, int chemistry, int physics, int biology);
}
class StudentA implements Mark{
    int totalMark;
    @Override
    public double getPercentage(int math, int chemistry, int physics) {
        totalMark = math+chemistry+physics;
        double avgPercentage = totalMark/3;
        return avgPercentage;
    }

    @Override
    public double getPercentage(int math, int chemistry, int physics, int biology) {
        return 0;
    }
}
class StudentB implements Mark{
    private int biology;
    @Override
    public double getPercentage(int math, int chemistry, int physics) {
        return 0;
    }

    @Override
    public double getPercentage(int math, int chemistry, int physics, int biology) {
        int totalMark2 = math+chemistry+physics+biology;
        double avgPercentage = totalMark2/4;
        return avgPercentage;
    }
}
class MarkTester{
    public static void main(String[] args) {
        Mark [] m = {new StudentA(), new StudentB()};
        for (Mark arr:m){
            System.out.println(arr.getPercentage(90, 78, 99));
            System.out.println(arr.getPercentage(90,30, 67, 89));
        }
    }
}


