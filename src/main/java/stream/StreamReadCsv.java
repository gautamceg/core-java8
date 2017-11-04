package stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamReadCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "vinExport1.csv";
		processInputFile(fileName);

	}

	private static void processInputFile(String fileName) {
		List<YourJavaItem> itemList = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
			
			itemList=br.lines().skip(1).map(mapToItem).collect(Collectors.toList());
			br.close();
			
			for(YourJavaItem i : itemList)
				System.out.println(i.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static Function<String, YourJavaItem> mapToItem = (line) -> {
		String [] columnIndex = line.split(",");
		YourJavaItem item = new YourJavaItem();
		item.setVin(columnIndex[0]);
		item.setWebId(columnIndex[1]);
		item.setStatus(columnIndex[2]);
		//item.setPrice1(Long.valueOf(columnIndex[3]));
		//item.setPrice2(Long.valueOf(columnIndex[4]));
		
		return item;
	};

}
