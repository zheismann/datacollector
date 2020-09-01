package com.streamsets.pipeline.lib.salesforce;

import com.sforce.soap.partner.Field;
import com.sforce.soap.partner.FieldType;
import com.streamsets.pipeline.api.StageException;
import org.junit.Test;

public class TestSobjectRecordCreator {
    @Test
    public void whenByteArrayNullCreateFieldFailsWithNPE() throws StageException {
        SoapRecordCreator recordCreator = new SoapRecordCreator( null, null, "Attachment" );

        Object val = null;
        Field sfdcField = new Field();
        sfdcField.setType( FieldType.base64 );
        recordCreator.createField(null , val, DataType.USE_SALESFORCE_TYPE, sfdcField );
    }
}

