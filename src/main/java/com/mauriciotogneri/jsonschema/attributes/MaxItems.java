package com.mauriciotogneri.jsonschema.attributes;

import com.mauriciotogneri.jsonschema.json.JsonField;
import com.mauriciotogneri.jsonschema.json.JsonValueNumber;
import com.mauriciotogneri.jsonschema.support.PositiveNumber;

public class MaxItems implements Attribute
{
    private final PositiveNumber value;

    public MaxItems(PositiveNumber value)
    {
        this.value = value;
    }

    @Override
    public JsonField json()
    {
        return new JsonField("maxItems", new JsonValueNumber(value));
    }
}