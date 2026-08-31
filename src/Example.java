import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;
import java.util.*;
import static java.time.format.DateTimeFormatter.*;


public class Example {
       public static void main(String args[]){

           String jsonDate = "2025-11-01T21:25:00";

           LocalDateTime dateTime = LocalDateTime.parse(jsonDate,
                   ISO_LOCAL_DATE_TIME);

           System.out.println("Parsed DateTime: " + dateTime);
//
          // Months difference
           var dob = java.time.LocalDate.of(2005,12,8);
           var today = java.time.LocalDate.now();
           long months = ChronoUnit.MONTHS.between(dob,today);

           System.out.println("Difference in Months:" + months);
//
//
//          //even avaerage number
//           List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7,8,9,10));
//
//          java.util.OptionalDouble average = numbers.stream()
//                  .filter(nu -> nu % 2 != 0)
//                  .mapToInt(Integer ::intValue)
//                   .average();
//          System.out.println(average);
           




       }
    }


