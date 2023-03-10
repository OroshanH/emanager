package oslomet.emanager.inbound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InboundRepository {

    @Autowired
    private JdbcTemplate db;


    public void lagreInbound(Inbound inbound) {
        String sql = "MERGE INTO Inbound i USING (VALUES(?, ?, ?, ?, ?)) AS vals(quantity, produktid, purchaseorderid, purchaseorderlineid, status) " +
                "ON i.produktid = vals.produktid " +
                "WHEN MATCHED THEN UPDATE SET i.quantity = i.quantity + vals.quantity, i.purchaseorderid = vals.purchaseorderid, i.purchaseorderlineid = vals.purchaseorderlineid, i.status = vals.status " +
                "WHEN NOT MATCHED THEN INSERT (quantity, produktid, purchaseorderid, purchaseorderlineid, status) VALUES (vals.quantity, vals.produktid, vals.purchaseorderid, vals.purchaseorderlineid, vals.status)";
        db.update(sql, inbound.getQuantity(), inbound.getProduktid(), inbound.getPurchaseorderid(), inbound.getPurchaseorderlineid(), inbound.getStatus());
    }


    public List<Inbound> hentAlleInbound(){
        String sql = "SELECT * FROM Inbound";
        List<Inbound> alleInbound = db.query(sql,new BeanPropertyRowMapper(Inbound.class));
        return alleInbound;
    }

}
