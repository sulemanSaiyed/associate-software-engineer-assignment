const images = [
  'images/cat1.jpeg',
  'images/cat2.jpeg',
  'images/cat3.jpeg'
];

let currentIndex = 0;
const sliderImage = document.getElementById('slider-image');
const thumbs = document.querySelectorAll('.thumb');

function updateImage(index) {
  sliderImage.style.opacity = 0;
  setTimeout(() => {
    sliderImage.src = images[index];
    sliderImage.style.opacity = 1;

    thumbs.forEach(t => t.classList.remove('active'));
    thumbs[index].classList.add('active');

    currentIndex = index;
  }, 300);
}

document.getElementById('next').addEventListener('click', () => {
  const nextIndex = (currentIndex + 1) % images.length;
  updateImage(nextIndex);
});

document.getElementById('prev').addEventListener('click', () => {
  const prevIndex = (currentIndex - 1 + images.length) % images.length;
  updateImage(prevIndex);
});

thumbs.forEach((thumb, index) => {
  thumb.addEventListener('click', () => updateImage(index));
});
