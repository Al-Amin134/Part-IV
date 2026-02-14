import numpy as np
import matplotlib.pyplot as plt
import tensorflow as tf
from tensorflow.keras.layers import Dense, Input
from tensorflow.keras.models import Model
from tensorflow.keras.optimizers import Adam

def get_data(x,data_type):
	if data_type==1:
		return 5*x+10
	elif data_type==2:
		return 10*x**2+5*x+10
	elif data_type==3:
		return 4*x**3+3*x**2+5*x+10
	else:
		return 0
#Model Building		
def build_model():
	input_layer = Input(shape=(1,))
	h1 = Dense(64,activation="relu")(input_layer)
	h2 = Dense(32,activation = "relu")(h1)
	h3 = Dense(16, activation = "relu")(h2)
	output = Dense(1)(h3)
	model = Model(inputs = input_layer, outputs = output)
	model.compile(optimizer=Adam(), loss = "mse", metrics =["mae"])
	model.summary()
	return model

#Model Training
def training(model,x_train,y_train,x_val,y_val, epochs):
	model.fit(
		x_train, y_train,
		validation_data = (x_val,y_val),
		epochs = epochs,
		batch_size = 64,
		verbose = 1
	)
	return model
	
		
def main():
	x_train = np.linspace(-10,10,10000)
	x_val = np.linspace(-10,10,2000)
	x_test = np.linspace(-10,10,2000)
	seed = 1
	#train y
	y_train1 = get_data(x_train,1)
	y_train2 = get_data(x_train,2)
	y_train3 = get_data(x_train,3)
	
	#Validation y
	y_val1 = get_data(x_val,1)
	y_val2 = get_data(x_val,2)
	y_val3 = get_data(x_val,3)
	
	#Test y
	y_test1 = get_data(x_test,1)
	y_test2 = get_data(x_test,2)
	y_test3 = get_data(x_test,3)
	
	model = build_model()
	model1 = training(model,x_train,y_train1,x_val,y_val1, 20)
	pred_y1 = model1.predict(x_test)
	
	model2 = training(model,x_train,y_train2,x_val,y_val2, 20)
	pred_y2 = model2.predict(x_test)
	
	model3 = training(model,x_train,y_train3,x_val,y_val3, 20)
	pred_y3 = model3.predict(x_test)
	
	plt.subplot(3,1,1)
	plt.plot(x_test,y_test1, label="original_equation1",color="g")
	plt.plot(x_test,pred_y1, label="predicted_equation1",color="r")
	plt.xlabel("x")
	plt.ylabel("y")
	plt.legend()
	plt.title("Equation: 5*x+10")
	plt.grid("true")
	
	plt.subplot(3,1,2)
	plt.plot(x_test,y_test2, label="original_equation2",color="g")
	plt.plot(x_test,pred_y2, label="predicted_equation2",color="r")
	plt.xlabel("x")
	plt.ylabel("y")
	plt.title("Equation: 10*x**2+5*x+10")
	plt.grid("true")
	plt.legend()
	
	plt.subplot(3,1,3)
	plt.plot(x_test,y_test3, label="original_equation3",color="g")
	plt.plot(x_test,pred_y3, label="predicted_equation3",color="r")	
	plt.xlabel("x")
	plt.ylabel("y")
	plt.title("Equation: 4*x**3+3*x**2+5*x+10")
	plt.grid("true")
	plt.legend()
	
	plt.xlabel("x")
	plt.ylabel("y")
	plt.legend()
	plt.grid("true")
	plt.tight_layout()
	plt.show()

if __name__=="__main__":
	main()
