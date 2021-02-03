package io.hans.coder.basis.api.opencsv;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @描述 OpenCsv解析类csv文件测试类
 * @author Hans
 * @created 2020/12/28 12:38
 */
public class OpenCsvMain {

    public static void main(String[] args) {

        try {
            InputStreamReader is = new InputStreamReader(new FileInputStream("D:\\datax数据\\SPAMS\\20201109.TXT"), StandardCharsets.UTF_8);
//            CSVParser csvParse = new CSVParserBuilder().withSeparator(',').withIgnoreQuotations(true).build();
            CSVParser csvParse = new CSVParserBuilder().withSeparator('\t').withIgnoreQuotations(true).build();
            CSVReader csvReader = new CSVReaderBuilder(is)
                    .withCSVParser(csvParse)
                    .withSkipLines(20)
                    .build();

            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }

}
