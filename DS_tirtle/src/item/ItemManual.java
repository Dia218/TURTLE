package item;

import javax.swing.ImageIcon;
import item.armors.*;
import item.processedFoods.*;
import item.unprocessedFoods.*;
import item.weapons.*;

public class ItemManual {			
	
	//
	//*������ ��ü ��Ӱ���*
	//
	
	//Level 0
	//Item Ŭ���� = ��� ������ ���� Ŭ�������� ����Ŭ����
	
	//Level 1
	//Item Ŭ������ ��ӹ޴� �ڽ� Ŭ���� = Foods, Tools
	
	//Level 2
	//Foods Ŭ������ ��ӹ޴� �ڽ� Ŭ���� = ProcessedFoods, UnprocessedFoods
	
	//Tools Ŭ������ ��ӹ޴� �ڽ� Ŭ���� = Armors, Weapons
	
	//Level 3
	//ProcessedFoods Ŭ������ ��ӹ޴� �ڽ� Ŭ���� = prcessedFoods ��Ű�� ���� ��� Ŭ������
	
	//UnprocessedFoods Ŭ������ ��ӹ޴� �ڽ� Ŭ���� = unprcessedFoods ��Ű�� ���� ��� Ŭ������

	//Armors Ŭ������ ��ӹ޴� �ڽ� Ŭ���� = armors ��Ű�� ���� ��� Ŭ������

	//Weapons Ŭ������ ��ӹ޴� �ڽ� Ŭ���� = weapons ��Ű�� ���� ��� Ŭ������

	//ex) GrassSuit�� ��Ӱ��� : Item > Tools > Armors > GrassSuit
	
	
	//
	//*������ Ŭ������ ����*
	//
	
	//������ Ŭ���� �ȿ��� private �ʵ�� public �޼ҵ尡 ����ִ�.
	
	//������ ���� ����ִ� �����ʹ� Ŭ������ ��ӿ� ���� �ٸ���.
	
	//ex1) BerryJam Ŭ���� : (�ʵ�)name, img, starvePoint, healPoint (�޼ҵ�)returnName, returnImg, returnStarvePoint, returnHealPoint
	
	//ex2) GrassSuit Ŭ���� : (�ʵ�)name, img, durability, defecne (�޼ҵ�)returnName, returnImg, returnDurability, returnDEF
	
	
	//
	//*������ Ŭ������ ���*
	//
	
	//������ Ŭ������ �̾� �� ���� ������ ��Ű���� import �ؾ� �Ѵ�.
	
	//�� ������ Ŭ�������� ���� ��Ű���� �з��Ǿ� �ִ�.
	
	//import �� ���� item.*;�� �ۼ��Ѵٸ� item��Ű�� ���� �ٸ� ��Ű���� ������ �� ����.
	
	//ex1) GrassSuit Ŭ������ import �ް� ���� �� : import.item.armor.*;
	
	//ex2) BerryJam Ŭ������ import �ް� ���� �� : import.item.processedFoods.*;
	
	//������ �����͸� �̾� �� ����
	
	//�̾ƾ� ������ Ŭ���� ��ü�� �����ϰ�
	
	//�� ��ü�� ������ ��ü���� ����־�� �Ѵ�.
	
	//��, ������ �����͸� �̾� �� ���� ������ �ʵ尪�� �ƴ� �޼ҵ尪�� �����ؾ� �Ѵ�.
	
	//ex)	GrassSuit Ŭ������ �̸��� �̾� �� ��
	//GrassSuit grassSuit = new GrassSuit();
	//Item item = grassSuit.returnName();
	
	//����� item.name = "Ǯ ����"
	
	
	//
	//*������ �ʵ�� �޼ҵ� ����*
	//
	
	//���� ģ���� � ������ ������ �ִ��� ���� ��
	
	//������ �ʵ��
	
	//�̸�
	//private static String name;
	
	//�̹��� ������
	//static private ImageIcon img;
	
	//��� ȸ����
	//private static int starvePoint;
	
	//ü�� ȸ����
	//private static int healPoint;
	
	//������
	//private int durability;
		
	//����
	//private static int defence;
		
	//���ݷ�
	//private static int attack;
		
	//������ �޼ҵ��
	
	//�̸� return
	//public String returnName();
	
	//�̹��� ������ return
	//public ImageIcon returnImg();
	
	//��� ȸ���� return
	//public int returnStarvePoint();
	
	//ü�� ȸ���� return
	//public int returnHealPoint();
	
	//������ return
	//public int returnDurability();
	
	//���� return
	//public int returnDEF();
	
	//���ݷ� return
	//public int returnATK();
	
	//�� �Ѹ� �����~~~
	//2022.05.16
	//�cġ��

}
