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
	
	//ex1) BerryJam Ŭ���� : (�ʵ�)name, img, starvePoint, healPoint (�޼ҵ�)returnName(), returnImg(), returnStarvePoint(), returnHealPoint()
	
	//ex2) GrassSuit Ŭ���� : (�ʵ�)name, img, durability, defecne (�޼ҵ�)returnName(), returnImg(), returnDurability(), returnDEF(), returnDurDec(int i)
	
	
	
	//
	//*������ Ŭ������ ���*
	//
	
	//������ Ŭ������ �̾� ���� ����� Item��ü�� �����ϰ�
	
	//�� ������ Ŭ���� ��ü�� �����Ͽ�
	
	//Item ��ü�� ��ĳ�����Ͽ� �����Ѵ�.
	
	//�׷��� ������ Item ��ü��
	
	//�� ������ Ŭ������ ������ ����.
	
	
	//������ Ŭ������ �̾� �� ���� ���� ������ ��Ű���� import �ؾ� �Ѵ�.
	
	//�� ������ Ŭ�������� ���� ��Ű���� �з��Ǿ� �ִ�.
	
	//import �� ���� item.*;�� �ۼ��Ѵٸ� item��Ű�� ���� �ٸ� ���� ��Ű���� ������ �� ����.
	
	//ex1) GrassSuit Ŭ������ import �ް� ���� �� : import.item.armor.GrassSuit;
	
	//ex2) BerryJam Ŭ������ import �ް� ���� �� : import.item.processedFoods.BerryJam;
	
	
	//ex)	GrassSuit Ŭ������ �̸��� �̾� �� ��
	
	//import item.Item;
	//import.item.armor.GrassSuit;
	
	//...
	
	//Item item;
	//GrassSuit grassSuit = new GrassSuit();
	//item = grassSuit;
	
	//item��ü�� GrassSuit��ü�� ��ĳ���õǾ� ������ �Էµ�.
   
	//JButton test = new JButton(item.returnImg());
    //test.addActionListener(GameSystem.userListener);
    //test.add(test);
	
	//��� test ��ư�� Ǯ ���� �̹����� �����.
	
	
	
	//
	//*������ �����͸� �ҷ����� ��ɾ��*
	//
	
	//�̸� return
	//item.returnName();
	
	//�̹��� ������ return
	//item.returnImg();
	
	//��� ȸ���� return
	//item.returnStarvePoint();
	
	//ü�� ȸ���� return
	//item.returnHealPoint();
	
	//������ return
	//item.returnDurability();
	
	//���� return
	//item.returnDEF();
	
	//���ݷ� return
	//item.returnATK();

	//�������� i��ŭ �����ϴ� �޼ҵ�
	//item.returnDurDec(int i);
	
	//�� �Ѹ� �����~~~
	//2022.05.16
	//�cġ��

}
