package tong;

public class FamilyAccount {

	public static void main(String[] args) {
		String details = "收支\t账户金额\t收支金额\t说  明\n";
		int balance = 10000;
		
		
		boolean loopFlag = true;
		
		do {
			System.out.println("\n----------家庭收入记账软件----------\n");
			System.out.println("          1收支明细");
			System.out.println("          2登记收入");
			System.out.println("          3登记支出");
			System.out.println("          4退   出");
			System.out.println();
			System.out.println("       	请选择（1-4）：");
			
			char key = Utility.readMenuSelection();
			
			switch(key) {
			case '1':
				//收支明细
				System.out.println("----------当前收支明细记录----------");
				System.out.println(details);
				System.out.println("---------------------");
				break;
				
			case '2':
				//登记收入
				System.out.println("请输入收入金额：");
				int amount1 = Utility.readNumber();
				System.out.println("请输入收入说明");
				String info1 = Utility.readString();
				
				balance += amount1;
				details += "收入" + "\t" + balance + "\t" +amount1 + "\t" + info1+ "\n";
				System.out.println("----------登记完成----------");
				break;
			
			case '3':
				//登记支出
				System.out.println("请输入支出金额：");
				int amount2 = Utility.readNumber();
				System.out.println("请输入支出说明");
				String info2 = Utility.readString();
				
				balance -= amount2;
				details += "支出" + "\t" + balance + "\t" +amount2 + "\t" + info2+ "\n";
				System.out.println("----------登记完成----------");
				break;
			case '4':
				//退出
				System.out.println("确认是否退出（Y/N）");
				char yn = Utility.readConfirSelection();
				if(yn == 'Y') {
					loopFlag = false;
				}
				break;
			}
		} while (loopFlag);
	}

}
