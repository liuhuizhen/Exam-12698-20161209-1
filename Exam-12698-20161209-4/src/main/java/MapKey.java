import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class MapKey {
	
	public static void main(String[] args) {
		Random r=new Random(System.currentTimeMillis());
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<50;i++){
			list.add(r.nextInt(100));
		}
		HashMap<Integer, List<Integer>> map=new HashMap<Integer, List<Integer>>();
		for(int i=0;i<10;i++){
			map.put(i, new ArrayList<Integer>());
		}
		for(int temp:list){
			int key=temp/10;
			List<Integer> thisList = map.get(key);
			thisList.add(temp);
		}
		
		//��������
		System.out.print("�������50��С��100�������ֱ��ǣ�");
		for(int i:list){
			System.out.print(i+" ");
		}
		//�������δ�����map
		System.out.println();
		System.out.print("Map�е�����Ϊ��");
		for(int i=0;i<10;i++){
			System.out.print(i+"==>"+map.get(i));
		}
		//map����
		for(int i=0;i<10;i++){
			List<Integer> thisList = map.get(i);
			Collections.sort(thisList);
			map.put(i, thisList);
		}
	
		//�������������map
		System.out.println();
		System.out.print("������MapΪ��");
		for(int i=0;i<10;i++){
			System.out.print(i+"==>"+map.get(i));
		}
	
	}

}
