package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
				
				public static List<String [ ]> read(final String file) {
						
						final List<String[ ]> data = new LinkedList<String[ ]>();
						String dataRow;
						try {
							final BufferedReader br = new BufferedReader(new FileReader(file));
							
							while ((dataRow = br.readLine()) != null) {
								final String [ ] dataRecords = dataRow.split (" , ");
								data.add(dataRecords);
							} 
									final String [ ] dataRecords = dataRow.split (" , ");
									data.add(dataRecords);
							
						} catch (final FileNotFoundException e) {
							System.out.println("COULD NOT FIND THE FILE");
							e.printStackTrace();
						} catch (final IOException e) {
							System.out.println("COULD NOT READ THE FILE");
							e.printStackTrace();
						}
						return data;
				}
				
}
