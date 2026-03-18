package ee.ut.math.tvt.salessystem.dataobjects;

import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;

public class GTv12 {

	@Test(timeout = 4000)
	public void testGetQuantityReturningZero() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Integer integer0 = Integer.getInteger("i0D", 0);
	    soldItem0.setQuantity(integer0);
	    Integer integer1 = soldItem0.getQuantity();
	    assertEquals(0, (int) integer1);
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningPositive() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 1362);
	    Integer integer0 = soldItem0.getQuantity();
	    assertEquals(1362, (int) integer0);
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningPositive() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setPrice(1362.50980877);
	    double double0 = soldItem0.getPrice();
	    assertEquals(1362.50980877, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningNull() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = soldItem0.getStockItem();
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testGetSumReturningPositive() throws Throwable {
	    Long long0 = new Long((-2406L));
	    StockItem stockItem0 = new StockItem(long0, "", "", 5017.4, (-1));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-2655));
	    soldItem0.setPrice((-2655));
	    double double0 = soldItem0.getSum();
	    assertEquals(7049025.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningPositive() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long(395L);
	    soldItem0.setId(long0);
	    Long long1 = soldItem0.getId();
	    assertEquals(395L, (long) long1);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningZero() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long(0L);
	    soldItem0.setId(long0);
	    Long long1 = soldItem0.getId();
	    assertEquals(0L, (long) long1);
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningNegative() throws Throwable {
	    Long long0 = new Long((-2406L));
	    StockItem stockItem0 = new StockItem(long0, "", "", 5017.4, (-1));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-2655));
	    Integer integer0 = soldItem0.getQuantity();
	    assertEquals((-2655), (int) integer0);
	}

	@Test(timeout = 4000)
	public void testGetNameReturningNull() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    String string0 = soldItem0.getName();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningZero() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    double double0 = soldItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetPriceIsPositive() throws Throwable {
	    Long long0 = new Long((-2406L));
	    StockItem stockItem0 = new StockItem(long0, "", "", 5017.4, (-1));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-2655));
	    soldItem0.getStockItem();
	    assertEquals((-2655), (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetNameReturningEmptyString() throws Throwable {
	    Long long0 = new Long((-2406L));
	    StockItem stockItem0 = new StockItem(long0, "", "", 5017.4, (-1));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-2655));
	    soldItem0.getName();
	    assertEquals((-1.3321196999999998E7), soldItem0.getSum(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningNull() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Integer integer0 = soldItem0.getQuantity();
	    assertNull(integer0);
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetQuantityIsZero() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = new StockItem();
	    soldItem0.setStockItem(stockItem0);
	    StockItem stockItem1 = soldItem0.getStockItem();
	    assertSame(stockItem1, stockItem0);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningNull() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = soldItem0.getId();
	    assertNull(long0);
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    String string0 = soldItem0.toString();
	    assertEquals("SoldItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningNegative() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long((-1L));
	    soldItem0.setId(long0);
	    Long long1 = soldItem0.getId();
	    assertEquals((-1L), (long) long1);
	}

	@Test(timeout = 4000)
	public void testGetSumReturningZero() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Integer integer0 = new Integer((-2191));
	    soldItem0.setQuantity(integer0);
	    double double0 = soldItem0.getSum();
	    assertEquals(-0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetSumReturningNegative() throws Throwable {
	    Long long0 = new Long((-2406L));
	    StockItem stockItem0 = new StockItem(long0, "", "", 5017.4, (-1));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-2655));
	    double double0 = soldItem0.getSum();
	    assertEquals((-1.3321196999999998E7), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningNegative() throws Throwable {
	    Long long0 = new Long((-2406L));
	    StockItem stockItem0 = new StockItem(long0, "", "", 5017.4, (-1));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-2655));
	    soldItem0.setPrice((-2655));
	    double double0 = soldItem0.getPrice();
	    assertEquals((-2655.0), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetQuantityIsPositive() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "StockItem{id=%d, name='%s'}", "StockItem{id=%d, name='%s'}", 0L, 1192);
	    soldItem0.setStockItem(stockItem0);
	    StockItem stockItem1 = soldItem0.getStockItem();
	    assertEquals("StockItem{id=%d, name='%s'}", stockItem1.getName());
	}

	@Test(timeout = 4000)
	public void testSetName() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setName("B[nq+*e':G|+@jef7-I");
	    String string0 = soldItem0.getName();
	    assertEquals("B[nq+*e':G|+@jef7-I", string0);
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetPriceIsNegative() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "M\"XRi!#3)c:gvZwp9%", "@R?#", (-1258.295), (-1579));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-1579));
	    soldItem0.getStockItem();
	    assertEquals(1986847.8050000002, soldItem0.getSum(), 0.01);
	}

}