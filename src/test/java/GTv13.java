package ee.ut.math.tvt.salessystem.dataobjects;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv13 {

	@Test(timeout = 4000)
	public void testGetQuantityReturningZero() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    int int0 = stockItem0.getQuantity();
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningPositive() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "ee.ut.math.tvt.salessystem.dataobjects.StockItem", "ee.ut.math.tvt.salessystem.dataobjects.StockItem", (-1880.0), 0);
	    stockItem0.setPrice(822.97911244);
	    double double0 = stockItem0.getPrice();
	    assertEquals(822.97911244, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetDescriptionReturningNonEmptyString() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setDescription("tsnLWL%\"g17.V)i");
	    String string0 = stockItem0.getDescription();
	    assertEquals("tsnLWL%\"g17.V)i", string0);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningPositive() throws Throwable {
	    Long long0 = Long.valueOf(899L);
	    StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
	    stockItem0.getId();
	    assertEquals("}$", stockItem0.getDescription());
	    assertEquals(204, stockItem0.getQuantity());
	    assertEquals(899.0, stockItem0.getPrice(), 0.01);
	    assertEquals("", stockItem0.getName());
	}

	@Test(timeout = 4000)
	public void testGetIdReturningZero() throws Throwable {
	    Long long0 = Long.getLong(";ZGc:Mkzb\"K7", 0L);
	    StockItem stockItem0 = new StockItem(long0, ";ZGc:Mkzb\"K7", ";ZGc:Mkzb\"K7", 0L, (-459));
	    stockItem0.getId();
	    assertEquals((-459), stockItem0.getQuantity());
	    assertEquals(0.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetNameReturningNull() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    String string0 = stockItem0.getName();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningNegative() throws Throwable {
	    Long long0 = Long.getLong(";ZGc:Mkzb\"K7", 0L);
	    StockItem stockItem0 = new StockItem(long0, ";ZGc:Mkzb\"K7", ";ZGc:Mkzb\"K7", 0L, (-459));
	    int int0 = stockItem0.getQuantity();
	    assertEquals(0.0, stockItem0.getPrice(), 0.01);
	    assertEquals((-459), int0);
	}

	@Test(timeout = 4000)
	public void testGetDescriptionReturningEmptyString() throws Throwable {
	    Long long0 = Long.valueOf(899L);
	    StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
	    assertEquals("}$", stockItem0.getDescription());
	    stockItem0.setDescription("");
	    stockItem0.getDescription();
	    assertEquals(899.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningZero() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    double double0 = stockItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetNameReturningEmptyString() throws Throwable {
	    Long long0 = new Long((-1L));
	    StockItem stockItem0 = new StockItem(long0, "`ma{w^H]TiV", "`ma{w^H]TiV", (-3314.22), 0);
	    stockItem0.setName("");
	    stockItem0.getName();
	    assertEquals(0, stockItem0.getQuantity());
	    assertEquals((-3314.22), stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetNameReturningNonEmptyString() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setName("StockItem{id=null, name='null'}");
	    String string0 = stockItem0.getName();
	    assertEquals("StockItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    String string0 = stockItem0.toString();
	    assertEquals("StockItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningNull() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    Long long0 = stockItem0.getId();
	    stockItem0.setId(long0);
	    assertEquals(0, stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetIdReturningNegative() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    Long long0 = new Long((-1L));
	    stockItem0.setId(long0);
	    Long long1 = stockItem0.getId();
	    assertEquals((-1L), (long) long1);
	}

	@Test(timeout = 4000)
	public void testSetQuantity() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "StockItem{id=%d, name='%s'}", "j{8K2f8Y0:jE0", 0L, (-411));
	    stockItem0.setQuantity(2);
	    int int0 = stockItem0.getQuantity();
	    assertEquals(2, int0);
	}

	@Test(timeout = 4000)
	public void testGetDescriptionReturningNull() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    String string0 = stockItem0.getDescription();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningNegative() throws Throwable {
	    Long long0 = Long.getLong(";ZGc:Mkzb\"K7", 0L);
	    StockItem stockItem0 = new StockItem(long0, ";ZGc:Mkzb\"K7", ";ZGc:Mkzb\"K7", 0L, (-459));
	    stockItem0.setPrice((-459));
	    double double0 = stockItem0.getPrice();
	    assertEquals((-459.0), double0, 0.01);
	}

}