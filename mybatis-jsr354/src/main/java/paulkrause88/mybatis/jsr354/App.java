package paulkrause88.mybatis.jsr354;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;

/**
 * Hello world!
 * @see <a href="https://github.com/JavaMoney/javamoney-examples/blob/master/console/javamoney-console-simple/src/main/java/org/javamoney/examples/console/simple/MoneyDemo.java">
 * MoneyDemo.java</a>
 */
public class App {
	public static void main(String[] args) {
		Money amt1 = Money.of("USD", 10.1234556123456789);
		FastMoney amt2 = FastMoney.of("USD", 123456789);
		Money total = amt1.add(amt2);
		System.out.println(total);
	}
}
