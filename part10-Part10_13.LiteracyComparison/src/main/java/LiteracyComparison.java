
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                .map(val -> val.split(","))
                .sorted((p1, p2) -> {
                    return Double.valueOf(p1[5]) == Double.valueOf(p2[5]) ? 0 : 
                    Double.valueOf(p1[5]) < Double.valueOf(p2[5]) ? -1 : 1;
                })
                .forEach(p -> System.out.println(p[3] + " ("
                 + p[4] + "), " + p[2].trim().substring(0, p[2].length() - 5) + ", " + p[5]));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // 아래의 방식처럼 클래스를 생성해서도 가능함
        // ArrayList<Result> results = new ArrayList<>();
        // try {
        //     Files.lines(Paths.get("literacy.csv"))
        //             .map(l -> l.split(","))
        //             .map(a -> new Result(a[2].replace("(%)", "").trim(), a[3], Integer.valueOf(a[4]), Double.parseDouble(a[5])))
        //             .forEach(t -> results.add(t));
        // } catch (IOException ex) {
        //     System.out.println("Error reading file.");
        // }
        
        // results.stream().sorted((t1, t2) -> {
        //     if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
        //         return 1;
        //     }
        //     if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
        //         return -1;
        //     }
        //     return 0;
        // }).forEach(t -> System.out.println(t));
    }
}
