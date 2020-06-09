package io.lae.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoSegmento.Adapter.class)
public enum CatalogoSegmento {

	PP("PP"),

	TC("TC"),

	TD("TD");

	private String value;

	CatalogoSegmento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static CatalogoSegmento fromValue(String text) {
		for (CatalogoSegmento b : CatalogoSegmento.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<CatalogoSegmento> {
		@Override
		public void write(final JsonWriter jsonWriter, final CatalogoSegmento enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public CatalogoSegmento read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return CatalogoSegmento.fromValue(String.valueOf(value));
		}
	}
}
