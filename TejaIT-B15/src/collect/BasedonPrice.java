package collect;

import java.util.Comparator;

public class BasedonPrice implements Comparator<Pedilite> {

	@Override
	public int compare(Pedilite o1, Pedilite o2) {
		
		return o1.price.compareTo(o2.price);
	}

}
