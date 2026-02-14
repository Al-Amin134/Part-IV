from tensorflow.keras.layers import Input,Dense, Flatten
from tensorflow.keras.models import Model
from tensorflow.keras.optimizers import Adam

def build_model():
	input_layer = Input(shape=(2,))
	h1 = Dense(3, activation="relu")(input_layer)
	h2 = Dense(3, activation = "relu")(h1)
	output = Dense(1)(h2)
	model = Model(inputs=input_layer, outputs=output)
	model.compile(optimizer = Adam(), loss = "categorical_crossentropy", metrics=["accuracy"])
	return model

def main():
	model = build_model()
	model.summary()

if __name__=="__main__":
	main()
