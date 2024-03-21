package btvn.bt09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Bt09 {
    public static void main(String[] args) throws ParseException {
        //Bài tập 1: Viết chương trình để lấy ngày hiện tại của hệ thống
        // và các nơi bao gồm : Asia/Tokyo, Australia/Sydney ,America/Sao_Paulo
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.printf("Thời gian tại %s là : %s\n",
                ZoneId.of("Asia/Tokyo"),
                ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Tokyo")).format(formatter));

        System.out.printf("Thời gian tại %s là : %s\n",
                ZoneId.of("Australia/Sydney"),
                ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Australia/Sydney")).format(formatter));

        System.out.printf("Thời gian tại %s là : %s\n",
                ZoneId.of("America/Sao_Paulo"),
                ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Sao_Paulo")).format(formatter));

        //Bài tập 2: Viết chương trình để lấy thời gian hiện tại (giờ phút giây).
        DateTimeFormatter formatterHour = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Giờ hiện tại là : " + LocalDateTime.now().format(formatterHour));

        //Bài tập 3: Viết chương trình để tính toán số ngày giữa hai ngày (LocalDate) nhập vào .
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Mời bạn nhập vào ngày thứ 1 (dd/MM/yyyy): ");
        String dateString1 = scanner.nextLine();
        java.util.Date date1 = simpleDateFormat.parse(dateString1);

        System.out.println("Mời bạn nhập vào ngày thứ 2 (dd/MM/yyyy): ");
        String dateString2 = scanner.nextLine();
        java.util.Date date2 = simpleDateFormat.parse(dateString2);

        LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Tính toán số ngày giữa 2 ngày
        Period period = Period.between(localDate1, localDate2);
        System.out.println("Số ngày giữa hai ngày là: " + period.getDays());

        //Bài tập 4: Viết chương trình để tính toán số ngày trong tháng hiện tại.
        System.out.println("Ngày của tháng hiện tại là : " + YearMonth.now().lengthOfMonth());

        //Bài tập 5: Viết chương trình để tính toán số ngày trong năm hiện tại.
        System.out.println("Ngày của năm hiện tại là : " + YearMonth.now().lengthOfYear());

        //Bài tập 6: Viết chương trình để chuyển đổi một chuỗi ngày sang một đối tượng LocalDate


    }
}
